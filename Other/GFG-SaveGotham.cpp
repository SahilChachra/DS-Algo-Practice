#include<iostream>
#include<stack>
#include<vector>
using namespace std;

long int saveGotham(vector<long int> h)
{
	
	long int top=0,curr=0,sum = 0,flag=0,index=0;
	stack<long int> s;
	int i = 0;
	s.push(h[h.size()-1]);
	for(i=h.size()-2;i>=0;i--){
		curr = h[i]; 
		if(curr<s.top() && s.size()!=0){
			sum+=s.top();
			s.push(curr);
		}
		else{
			while(s.size()!=0 && s.top()<=curr){
				s.pop();
			}
			if(s.size()!=0){
				sum+=s.top();
			}
			s.push(curr);
		}
	}
	
	return sum;
}

int main(){
	int t;
	cin>>t;
	while(t--){
	
		int n;
		cin>>n;
		int i,x;
		vector<long int> h;
		for(i=0;i<n;i++){
			cin>>x;
			h.push_back(x);
		}
		
		long int sum = saveGotham(h);
		cout<<sum%1000000001<<endl;
	}
	return 0;
}
