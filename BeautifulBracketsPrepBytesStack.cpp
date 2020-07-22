#include<iostream>
#include<stack>
using namespace std;

int countOperations(string s){
	int len = s.length();
	int c=0;
	stack<char> stk;
	int i;
	for(i=0;i<len;i++){
		
		if(s[i]=='{'){
			stk.push(s[i]);
		}
		else if(s[i]=='}'){
			if(stk.empty()==false && stk.top()=='{'){
				stk.pop();
			}
			else{
				stk.push(s[i]);
			}
		}
	}
	int ob=0,cb=0;

	int n = 0;
	int red_len = stk.size();
	//cout<<"Red_len : "<<red_len<<endl;
    while (!stk.empty() && stk.top() == '{') 
    { 
        stk.pop(); 
        n++; 
    } 
  	
    return (red_len/2 + n%2);
}


int main(){
	
	string s;
	int c=0;
	while(true){
		cin>>s;
		if(s[0]=='-')
			break;
		c=c+1;
		int ret = countOperations(s);
		cout<<c<<"."<<" "<<ret<<endl;
	}
	return 0;
}
