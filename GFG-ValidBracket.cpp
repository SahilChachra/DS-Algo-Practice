#include<iostream>
#include<stack>
#include<string>
using namespace std;

void countBrackets(string s){
	
	int len = s.length();
	stack<int> stk;
	int i=0;
	int cnt=0,res=0;
	char curr;
	stk.push(-1);
	for(i=0;i<len;i++){
		curr = s[i];
		
		if(curr=='(')
			stk.push(i);
		
		else if(curr==')'){
			stk.pop();
			if(stk.empty()==false)
				res = max(res, i-stk.top());
			else
				stk.push(i);
		}
	}
	cout<<res<<endl;
}

int main(){
	
	int n;
	cin>>n;
	string s;
	int i=0;
	for(i=0;i<n;i++){
		cin>>s;
		countBrackets(s);
	}
	
}
