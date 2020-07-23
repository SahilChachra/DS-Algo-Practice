#include<iostream>
#include <cstdlib>
using namespace std;

struct Node {
	int data;
	struct Node *next;
};

Node *head;

void insertNode(int a){
	Node *t = new Node();
	t->data = a;
	t->next = NULL;
	
	if(head==NULL){
		t->next = head;
		head = t;
		return;
	}
	
	Node *curr = head;
	while(curr->next!=NULL){
		curr=curr->next;
	}
	curr->next = t;
}

void removeDuplicate(){
	Node *curr = head;
	Node *nextN = NULL;
	while(curr->next!=NULL){
		if(curr->data == curr->next->data){
			nextN = curr->next->next;
			//cout<<"Removed : "<<curr->data<<" ";
			free(curr->next);
			curr->next = nextN;
		}
		else
		{
			curr = curr->next;
		}
	}
	cout<<endl;
}

void print(){
	Node *t = head;
	while(t!=NULL){
		cout<<t->data<<" ";
		t=t->next;
	}
	cout<<endl;
}

int main(){
	int t;
	int n,i,x;
	cin>>t;
	while(t--){
		cin>>n;
		
		for(i=0;i<n;i++){
			cin>>x;
			insertNode(x);
		}
		//print();
		removeDuplicate();
		print();
		head = NULL;
	}

	return 0;
}
