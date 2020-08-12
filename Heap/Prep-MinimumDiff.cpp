#include<iostream>
#include<queue>
#include<math.h>
using namespace std;

void findQClosestSectorToP(int arr[],int n,int p,int q){
	
	priority_queue<pair<int, int> > pq;
	
	for(int i=0;i<n;i++){
		pq.push(make_pair(abs(p-arr[i]), arr[i]));
		if(pq.size()>q)
			pq.pop();
	}
	
	while(!pq.empty()){
		cout<<pq.top().second<<" ";
		pq.pop();
	}
	cout<<endl;
	
}

int main(){
	
	int t;
	cin>>t;
	while(t--){
		int n,p,q;
		cin>>n>>p>>q;
		int arr[n];
		int i=0;
		for(i=0;i<n;i++)
			cin>>arr[i];
		findQClosestSectorToP(arr,n,p,q);
	}
	
	return 0;
}
