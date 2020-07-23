#include<iostream>
#include<stack>
#define MAX 100
using namespace std;

int M[MAX][MAX];

bool knows(int a,int b)
{
	return M[a][b];
}
int getIndex(int M[MAX][MAX], int n){
	stack<int> s; 
  
    int C; 
  
    
    for (int i = 0; i < n; i++) 
        s.push(i); 
  
   
    int A = s.top(); 
    s.pop(); 
    int B = s.top(); 
    s.pop(); 
  	cout<<"Before while, A : "<<A<<endl;
    cout<<"Before while, B : "<<B<<endl;
    while (s.size() > 1) 
    { 
        if (knows(A, B)) 
        { 
            A = s.top(); 
            s.pop(); 
        } 
        else
        { 
            B = s.top(); 
            s.pop(); 
        } 
    } 
  
  cout<<"After while, A : "<<A<<endl;
  cout<<"After while, B : "<<B<<endl;
    
    C = s.top(); 
    s.pop(); 
  cout<<"Before Check, C : "<<C<<endl;
    
    if (knows(C, B)) 
        C = B; 
  
    if (knows(C, A)) 
        C = A; 
  	cout<<"After Check, C : "<<C<<endl;
    
    for (int i = 0; i < n; i++) 
    { 
        if ( (i != C) && 
                (knows(C, i) ||  
                 !knows(i, C)) ) 
            return -1; 
    } 
  
    return C;
}

int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int i,j;
		//int M[MAX][MAX];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				cin>>M[i][j];
			}
		}
		
		int index = getIndex(M,n);
		cout<<index<<endl;
	}
	
}
