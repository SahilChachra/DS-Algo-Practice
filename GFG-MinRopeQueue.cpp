#include<vector>
#include<iostream>
#include<queue>
using namespace std;

void answer(priority_queue <long long int, vector<long long int>, greater<long long int> > p){
	
	priority_queue <long long int, vector<long long int>, greater<long long int> > q = p;
	long long int a=0,b=0;
	unsigned long long int s=0;
	while(q.size()!=1){
		a = q.top();
		q.pop();
		b = q.top();
		q.pop();
		a = a+b;
		s = s + a;
		q.push(a);
	}
	cout<<s<<endl;
}

int main(){
	
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		priority_queue<long long int, vector<long long int>, greater<long long int> > pq;
		int i=0;
		for(i=0;i<n;i++){
			long long int x;
			cin>>x;
			pq.push(x);
		}
		answer(pq);
	}
}
