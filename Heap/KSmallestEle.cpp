#include<iostream>
#include<queue>
using namespace std; 
void findKSmallest(int arr[], int n, int k){
	
	int i=0;
	
	priority_queue<int> pq;
	
	for(i=0;i<n;i++){
		pq.push(arr[i]);
		if(pq.size()>k)
			pq.pop();		
	}
	cout<<pq.top()<<endl;
	
}

int main(){
	
	int n;
	cin>>n;
	int i,k=0;
	int arr[n];
	cin>>k;
	for(i=0;i<n;i++)
		cin>>arr[i];
	findKSmallest(arr,n,k);
}
