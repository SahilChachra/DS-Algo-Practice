#include<iostream>
#include<queue>
#include <unordered_map>-std=c++11
using namespace std;

void KFrequencyNumber(int arr[], int n, int k){

	unordered_map<int,int> m;
	
	for(int i=0;i<n;i++){
		m[arr[i]]++;
	}
	
	priority_queue<pair<int, int>, vector<pair<int,int> >, greater<pair<int,int> > > pq;
		
	for(auto i:m){
		
		pq.push(make_pair(i.second, i.first));
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
	
	int i=0;
	for(i=0;i<n;i++)
		cin>>arr[i];
	KFrequencyNumber(arr, n,k);
	return 0;
}

