#include<iostream>
#include<queue>
#include<math.h>
using namespace std;

void findKClosest(int arr[], int n,int k, int x){
	
	priority_queue<pair<int,int> > pq;
	int i=0;
	
	for(i=0;i<n;i++){
		
		pq.push(make_pair(abs(arr[i]-x), arr[i]));
		if(pq.size()>k)
			pq.pop();		
	}
	while(!pq.empty()){
		cout<<pq.top().second<<" ";
		pq.pop();
	}
	cout<<endl;
}

int main(){
	
	int n;
	cin>>n;
	int arr[n];
	int k;
	cin>>k;
	int x;
	cin>>x;
	int i=0;
	for(i=0;i<n;i++)
		cin>>arr[i];
	findKClosest(arr, n,k,x);
	return 0;
}
