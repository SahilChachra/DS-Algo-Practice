#include<iostream>
#include<stack>
using namespace std;

int getWeight(string s){
	
	int len = s.length();
	int i=0;
	stack<char> stk;
	int sum=0;
	int num=0;
	char top;
	char mol;
	for(i=0;i<len;i++){
		
		if(s[i]=='(' || s[i]==')')
			continue;
			
		if(s[i]=='C'||s[i]=='H'||s[i]=='O'){
			stk.push(s[i]);
		}
		
		else {
			num = s[i] - 48;
			top = stk.top();
			stk.pop();
			if(top=='C'){
				sum=sum+(12*num);
			}
			else if(top=='O'){
				sum=sum+(16*num);
			}
			else{
				sum=sum+(1*num);
			}
			//cout<<"Sum is : "<<sum<<endl;
		}
	}
	while(stk.empty()==false){
		top = stk.top();
		stk.pop();
		if(top=='C'){
				sum=sum+12;
			}
			else if(top=='O'){
				sum=sum+16;
			}
			else{
				sum=sum+1;
			}
	}
	return sum;	
	
}

int main(){
	
	string s;
	cin>>s;
	
	int sum = getWeight(s);
	cout<<sum<<endl;
	
	return 0;
}
