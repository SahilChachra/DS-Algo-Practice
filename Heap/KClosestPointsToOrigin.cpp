#include<iostream>
#include<queue>
#include<math.h>
using namespace std;

void KNearestCord(int arr[][2], int n, int k){
	
	 priority_queue<pair<int, pair<int,int> > > pq;
	
	for(int i=0;i<n;i++){
		int v = pow(arr[i][0],2) + pow(arr[i][1],2);
		
		pq.push(make_pair(v, make_pair(arr[i][0], arr[i][1])));
		if(pq.size()>k)
			pq.pop();
	}
	cout<<"Printing Pairs"<<endl;
	while(!pq.empty()){
		pair<int,int> p= pq.top().second;
		cout<<p.first<<" "<<p.second<<endl;
		//cout<<pq.top().second.first<<" "<<pq.top().second.second<<endl;
		pq.pop();
	}
	
}

int main(){
	
	int n;
	cin>>n;
	int arr[n][2];
	int k;
	cin>>k;
	
	int i=0;
	for(i=0;i<n;i++)
		for(int j=0;j<2;j++)
		cin>>arr[i][j];
	KNearestCord(arr, n,k);
	return 0;
}

