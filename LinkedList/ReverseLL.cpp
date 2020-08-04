#include<iostream>
#include<cstdlib>
using namespace std;
struct Node {
	int data;
	Node* next;
};
Node* head;

void insertAtLast(int a){
	Node* temp = new Node();
	temp->data = a;
	temp->next = NULL;
	
	if(head==NULL){
	  temp->next = head;
	  head = temp;
	  return;
	}
	
	Node* curr = head;
	
	while(curr->next!=NULL){
		curr = curr->next;
	}
	curr->next = temp;
}

void reverseLinkedList(){
	Node *t, *prev, *next, *curr;
	curr = head;
	prev = NULL;
	while(curr!=NULL){
		next = curr->next;
		curr->next = prev;
		prev = curr;
		curr = next;
	}
	head = prev;
}

void print(){
	Node* temp = head;
	while(temp!=NULL){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<"\n";
}
int main()
{
	head = NULL;
	int t;
	cin>>t;
	while(t--){
	  int n,x,i;
	  cin>>n;
	  for(i=0;i<n;i++){
		  cin>>x;
		  insertAtLast(x);
	  }
	reverseLinkedList();
	print();
	head=NULL;
	}
	
	return 0;
}