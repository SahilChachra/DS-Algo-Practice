#include<iostream>
using namespace std;

int main(){
	int n;
	cin>>n;
	
	int k,i,j;

	for(i=1;i<=n;i++){
		for(k=i;k<=n-1;k++)
			cout<<" ";
		for(j=1;j<=i;j++)
			cout<<j;
		cout<<endl;
	}
	
	return 0;
}
