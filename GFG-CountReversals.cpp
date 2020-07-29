#include<iostream>
#include<stack>
#include<string>
using namespace std;

void countReversal(string s) {
	
	int len = s.length();
	int i=0;
	char ch;
	stack<int> stk;
	if(len%2!=0){
		cout<<-1<<endl;
		return;
	}
	for(i=0;i<len;i++){
		ch = s[i];
		
			if(stk.empty()==false && ch=='}') {
				if(stk.top()=='{')
				stk.pop();
			
				else
					stk.push(ch);
			}
			else
				stk.push(ch);
	}
	int newLen = stk.size();
	int n=0;
	while(stk.empty()==false && stk.top()=='{'){
		n++;
		stk.pop();
	}
	int ans = newLen/2 + n%2;
	cout<<ans<<endl;
	
}

int main(){
	
	int n;
	cin>>n;
	string s;
	while(n--){
		cin>>s;
		countReversal(s);
	}
	
	return 0;
}
