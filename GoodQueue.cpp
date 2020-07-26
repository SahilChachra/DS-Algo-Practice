#include<queue>
#include<iostream>
#include<string>
using namespace std;

bool lessThan(int x){
	int rem=0,sum=0;
	while(x!=0){
		rem = x%10;
		sum = sum + rem;
		x=x/10;
	}
	if(sum<=5)
		true;
	else
		false;
}

void findValue(int l, int r){
	
	queue<int> q;
	
	for(int i=l;i<=r;i++){
		if(lessThan(i)){
			q.push(i);
		}
	}
	while(!q.empty()){
		cout<<q.front()<<" ";
		q.pop();
	}
	cout<<endl;
	
}

int main(){
	
	int t;
	cin>>t;
	while(t--){
		string l,r;
		cin>>l>>r;
		findValue(stoi(l),stoi(r));
	}
	
	return 0;
}
