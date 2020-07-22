#include<cstdlib>
#include<iostream>
using namespace std;

struct Node {
	int data;
	struct Node *prev;
	struct Node *next;
};

Node *head;

Node* createNode(int a){
	Node *t = new Node();
	t->data = a;
	t->next = NULL;
	t->prev = NULL;
	return t;
}

void insertAtEnd(int a){
	
	Node *t = createNode(a);
	if(head==NULL){
		head=t;
		return;
	}
	Node *curr = head;
	while(curr->next!=NULL){
		curr=curr->next;
	}
	curr->next = t;
	t->prev = curr;
} 



void printForward(){
	//cout<<"Forward traversing"<<endl;
	
	Node *curr = head;
	while(curr!=NULL){
		cout<<curr->data<<" ";
		curr=curr->next;
	}
	cout<<endl;
}

void rotate(int N) 
{ 
    if (N == 0) 
        return; 
  
 
    struct Node* current = head; 

    int count = 1; 
    while (count < N && current != NULL) { 
        current = current->next; 
        count++; 
    } 
  
    if (current == NULL) 
        return; 
  
    struct Node* NthNode = current; 
   
    while (current->next != NULL) 
        current = current->next; 
 
    current->next = head; 
 
    head->prev = current; 

    head = NthNode->next; 

    head->prev = NULL; 

    NthNode->next = NULL; 
} 

int main(){
	int t;
	cin>>t;
	while(t--){
	int n;int k;
	//cout<<"Enter number of nodes : ";
	cin>>n>>k;
	int i,x;
	
	for(i=0;i<n;i++){
		cin>>x;
		insertAtEnd(x);
	}
	//printForward();
	
	rotate(k);
	printForward();
	head = NULL;
	
	}
	return 0;
}