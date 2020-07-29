#include<iostream>
#include<deque>
using namespace std;

void printMax(int arr[], int size,int k){
	
	deque<int> dq(k);
	int n = size;
	int i=0;
	
	for(i=0;i<k;i++){
		while((!dq.empty()) && arr[i]>=arr[dq.back()])
			dq.pop_back();
		
		dq.push_back(i);
	}
	
	for(;i<n;i++){
		cout<<arr[dq.front()]<<" ";
		
		while((!dq.empty()) && dq.front()<=(i-k))
			dq.pop_front();
		
		while((!dq.empty()) && arr[i]>=arr[dq.back()])
			dq.pop_back();
			
		dq.push_back(i);
	}
	cout<<arr[dq.front()];	
}

int main(){
	
	int n,k;
	cin>>n>>k;
	int arr[n];
	int i=0;
	for(i=0;i<n;i++)
		cin>>arr[i];
	/*int arr[] = { 12, 1, 78, 90, 57, 89, 56 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    int k = 3;
	printMax(arr,n,k);*/
	
	return 0;
}
