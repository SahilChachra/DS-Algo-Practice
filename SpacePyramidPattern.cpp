#include<iostream>
using namespace std;

int main(){
	int n;
	cin>>n;

	int k,i,j;
	int t=0;
	for(i=1;i<=n;i++){
		for(k=n-i;k>=1;k--){
			cout<<" ";
		}
		for(j=1;j<=i;j++){
			cout<<"* ";
		
		}
		cout<<endl;
	}
	
	return 0;
}
