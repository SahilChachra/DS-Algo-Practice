#include<iostream>
#include<queue>
#include<vector>
using namespace std;

void sortIt(int arr[], int n, int k){
	
	 priority_queue<int, vector<int>, greater<int> > pq;
	 vector<int> v;
	 int i;
	 for(i=0;i<n;i++){
	 	
	 	pq.push(arr[i]);
	 	
	 	if(pq.size()>k){
	 		v.push_back(pq.top());
	 		pq.pop();	 		
		 }
		 
	 }
	 
	 while(!pq.empty()){
	 	v.push_back(pq.top());
	 	pq.pop();
	}
	for(i=0;i<v.size();i++)
	 	cout<<v[i]<<" ";
	cout<<endl;
}

int main(){
	int n;
	cin>>n;
	int k;
	cin>>k;
	int arr[n];
	int i=0;
	for(i=0;i<n;i++)
		cin>>arr[i];
	sortIt(arr, n, k);
}

