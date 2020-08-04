#include <bits/stdc++.h>
  using namespace std;
  
  struct Node {
    int data;
    struct Node *next;
  };
  
  Node *head;
  
  void insertNode(int a){
    Node *t = new Node();
    if(head==NULL){
    t->data=a;
    t->next=head;
    head = t;
    return;
    }
    Node *curr = head;
    while(curr->next!=NULL){
      curr=curr->next;
    }
    t->next = NULL;
    t->data = a;
    curr->next = t;
  }
  
  void swapLast(){
    Node *curr = head;
    Node *prev = NULL;
    while(curr->next!=NULL){
      prev = curr;
      curr = curr->next;
    }
    prev->next = NULL;
    curr->next=head;
    head = curr;
    
  }
  
  void print(){
    Node *t = head;
    while(t!=NULL){
      cout<<t->data<<" ";
      t=t->next;
    }
    cout<<endl;
  }
  
  int main()
  {
    int t;
    cin>>t;
    while(t--){
      int n=0;
      int i,x=0;
      cin>>n;
      if(n==1){
      	cin>>x;
      	cout<<x<<endl;
      	continue;
	  }
      for(i=0;i<n;i++){
        cin>>x;
        insertNode(x);
      }
      //print();
      swapLast();
      print();
      head=NULL;
    }
    
    return 0;
  }