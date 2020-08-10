#include<iostream>
#include<queue>
#include<unordered_map>
using namespace std;

void FrequenctSort(int arr[], int n){
	
	unordered_map<int, int> m;
	
	for(int i=0;i<n;i++){
		m[arr[i]]++;
	}
	
	//priority_queue<pair<int, int>, vector<pair<int,int> >, greater<pair<int,int> > > pq;
	priority_queue<pair<int, int> > pq;
	
	for(auto i:m){
		
		pq.push(make_pair(i.second, i.first));
		
	}
	
	while(!pq.empty()){
		//cout<<pq.top().second<<" ";
		//pq.pop();
		int freq = pq.top().first;
		int ele = pq.top().second;
		for(int i=1;i<=freq;i++)
			cout<<ele<<" ";
		pq.pop();
	}
	cout<<endl;
	
}

int main(){
	
	int n;
	cin>>n;
	int arr[n];
	
	
	int i=0;
	for(i=0;i<n;i++)
		cin>>arr[i];
	FrequenctSort(arr, n);
	return 0;
}
