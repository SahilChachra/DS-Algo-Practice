#include<iostream>
#include<queue>
#include<math.h>
using namespace std;

void printlol(long long int arr[],long long int n){
	

	priority_queue<long long int> pq;
	long long int num = 1e9 + 7;
	long long int i=0;
	for(i=0;i<n;i++){
		pq.push(arr[i]);
	}
	
	while(pq.size()>1){
		long long int t1 = pq.top(); pq.pop();
		long long int t2 = pq.top(); pq.pop();
		
		long long int s = ((t1*3)%num - (t2*2)%num)%num;
		pq.push(s);
	}
	cout<<pq.top()<<endl;
	pq.pop();

}

int main(){
	
	long long int t;
	cin>>t;
	while(t--){
		long long int n;
		cin>>n;
		long long int arr[n];
		
		for(long long int i=0;i<n;i++)
			cin>>arr[i];
		printlol(arr, n);
	}
	
}
