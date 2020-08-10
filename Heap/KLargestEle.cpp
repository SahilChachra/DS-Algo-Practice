#include<iostream>
#include<queue>
#include<vector>
using namespace std;

void kLargestEles(int arr[], int n, int k){
	
	priority_queue <int, vector<int>, greater<int> > minh;
	
	for(int i=0;i<n;i++){
		minh.push(arr[i]);
		if(minh.size() > k)
			minh.pop();
	}
	
	while(!minh.empty()){
		cout<<minh.top()<<" ";
		minh.pop();
	}
	
}

int main(){
	
	int n;
	cin>>n;
	int k;
	cin>>k;
	int arr[n];
	int i=0;
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	
	kLargestEles(arr,n,k);
	
	return 0;
}


