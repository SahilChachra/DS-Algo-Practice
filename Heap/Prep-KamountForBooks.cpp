#include<iostream>
#include<queue>
using namespace std;

int numberOfBooks(int arr[],int n,int k){
	int c=0;
	
	priority_queue<int, vector<int>, greater<int> > pq;
	
	int i=0;
	for(i=0;i<n;i++){
		pq.push(arr[i]);
	}
	
	while(pq.top()<k){
		int t = pq.top();
		k = k - t;
		pq.pop();
		c=c+1;
	}
	
	return c;
}

int main(){
	
	int t;
	cin>>t;
	while(t--){
		int n,k;
		cin>>n>>k;
		int arr[n];
		
		for(int i=0;i<n;i++)
			cin>>arr[i];
		int cnt = numberOfBooks(arr, n, k);
		cout<<cnt<<endl;
	}
	
}
