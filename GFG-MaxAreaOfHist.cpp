#include<iostream>
#include<stack>
#include<vector>
using namespace std;

long int caclArea(vector<long int> h){
	
	long int max=0;
	stack<long int> s;
	long int top;
	long int area_with_top = 0;
	int i=0;
	
	while(i<h.size()){
		//cout<<"+++++++++++Iteration++++++++ "<<i<<endl;
		if(s.empty() || h[s.top()]<=h[i]){
			//cout<<"--------------In IF-------------"<<endl;
			//cout<<"Pushing : "<<i<<endl;
			s.push(i++);
			
		}
		else
		{
			//cout<<"---------------in ELSE----------"<<endl;
			top = s.top();
			s.pop();
			//cout<<"Top : "<<top<<endl;
			//cout<<"i : "<<i<<endl;
			area_with_top = h[top] * (s.empty()?i:i-s.top()-1);
			//cout<<"Area with top : "<<area_with_top<<endl;
			if(max<area_with_top)
				max = area_with_top;
			//cout<<"Max : "<<max<<endl;
		}
	}
	while(s.empty() == false){
		top = s.top();
		s.pop();
		
		area_with_top = h[top] * (s.empty() ? i : i - s.top() -1 );
		
		if(max<area_with_top)
			max = area_with_top;
	}
	
	return max;
}

int main(){
	
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		vector<long int> h;
		int i=0;
		long int x=0;
		for(i=0;i<n;i++)
		{
			cin>>x;
			h.push_back(x);
		}
		long int area = caclArea(h);
		cout<<area<<endl;
	}
	
	
	return 0;
}
