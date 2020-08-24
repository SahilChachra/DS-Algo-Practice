#include<iostream>
using namespace std;

int getSQRT(int x){
	
	if(x==0 || x==1) return x;
	
	int start=1,end=x,ans=0;
	
	while(start<=end){
		
		int mid = (start+end)/2;
		
		if(mid*mid==x) return mid;
		
		else if(mid*mid<x){
			start=mid+1;
			ans=mid;
		}
		
		else
		end = mid-1;
	}
	return ans;
	
}

int main(){
	
	int t;
	cin>>t;
	int n,sqrt;
	while(t--){
		cin>>n;
		sqrt = getSQRT(n);
		cout<<sqrt<<endl;
	}
	
	return 0;
}

