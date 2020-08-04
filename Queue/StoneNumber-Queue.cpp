#include<iostream>
#include<queue>
using namespace std;

void removeStones(queue<int> q){
	
	if(q.size()==1){
		cout<<q.front()<<endl;
		return;
	}
	
	int x;
	
	while(q.size()!=1){
		
		x = q.front();
		q.push(x);
		q.pop();
		q.pop();	
	}
	cout<<q.front()<<endl;
	
}

int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int i=0;
		queue<int> hq;
		for(i=1;i<=n;i++){
			hq.push(i);
		}
		
		removeStones(hq);
	}
	
	return 0;
}
