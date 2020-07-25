#include<iostream>
#include<queue>
using namespace std;
queue<int> reverse(queue<int> q) 
{ 
    // Size of ueue 
    int s = q.size(); 
  
    // Second queue 
    queue<int> ans; 
  
    for (int i = 0; i < s; i++) { 
  
        // Get the last element to the 
        // front of queue 
        for (int j = 0; j < q.size() - 1; j++) { 
            int x = q.front(); 
            q.pop(); 
            q.push(x); 
        } 
  
        // Get the last element and 
        // add it to the new queue 
        ans.push(q.front()); 
        q.pop(); 
    } 
    return ans; 
} 
  
// Driver Code 
int main(){
	int t;
	cin>>t;
	
	while(t--){
		
		int n;
		cin>>n;
		int i,x;

    queue<int> q; 
  
    for(i=0;i<n;i++)
    {
      cin>>x;
      q.push(x);
    }
  
    q = reverse(q); 
  
    while (!q.empty()) { 
        cout << q.front() << " "; 
        q.pop(); 
    }
    cout<<endl;
	}
    return 0; 
} 
