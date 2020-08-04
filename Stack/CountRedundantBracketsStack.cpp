#include<iostream>
#include<stack>
using namespace std;

int countRed(string s)
{
	int count=0;
	int len = s.length();
	stack<char> stk;
	char ch;
	for(int i=0;i<len;i++){
		ch = s.at(i);
		
		if(ch==')'){
			char top = stk.top();
			stk.pop();
			
			bool f = true;
			
			while(top!='('){
				if(top=='+'||top=='*'||top=='/'||top=='-')
					f = false;
				top=stk.top();
				stk.pop();
			}
			if(f==true)
				count+=1;
		}
		else
			stk.push(ch);
	}
	return count;
} 


int main() {
	
	string s;
	cin>>s;
	cout<<countRed(s)<<endl;	
	return 0;
}