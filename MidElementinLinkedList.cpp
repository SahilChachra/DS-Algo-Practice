#include <bits/stdc++.h>
  using namespace std;
  
  struct Node {
    int data;
     Node *next;
  };
  
  Node* head;
  
  void insertInBeg(int a){
    Node *t = new Node();
    t->data = a;
    t->next = head;
    head = t;
  }
  
  void searchMid(int n){
    int c=0;
    if(n%2==0)
      c = (n/2) - 1;
    else
      c = (n/2);
    int ctr=0;
    Node *t = head;
    while(t!=NULL){
      if(ctr==c){
        cout<<t->data<<endl;
        return;
      }
      ctr+=1;
      t=t->next;
    }
    
  }
  
  int main()
  {
    int t;
    cin>>t;
    while(t--){
      int n=0;
      cin>>n;
      int i,x=0;
      for(i=0;i<n;i++){
        cin>>x;
        insertInBeg(x);
      }
      searchMid(n);
    }
    
    return 0;
  }