#include<iostream>
#include<queue>
using namespace std;

void printNegative(int arr[], int n, int k)
{
	int i=0;
	queue<int> q;
	
	for(i=0;i<k;i++){
		if(arr[i] < 0) q.push(arr[i]);
	}
	for(i=k;i<n;i++){
		
		if(q.size()!=0)
			cout<<q.front()<<" ";
		else
			cout<<0<<" ";
			
		if(arr[i-k]<0) q.pop();
		if(arr[i]<0) q.push(arr[i]);
	}
	if(q.size()!=0)
		cout<<q.front()<<" ";
	else
		cout<<0<<" ";
	
	cout<<endl;
}


int main(){
	
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int arr[n];
		int i=0;
		for(i=0;i<n;i++){
			cin>>arr[i];
		}
		int k=0;
		cin>>k;
		
		printNegative(arr,n,k);
	}
	
	return 0;
}
