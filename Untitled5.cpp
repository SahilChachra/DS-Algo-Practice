#include<iostream>
using namespace std;

int main(){
	int n;
	cin>>n;
	
	int k,i,j;
	int no=1;
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++){
			cout<<no;
			no++;
		}
		cout<<endl;
	}
	
	return 0;
}
