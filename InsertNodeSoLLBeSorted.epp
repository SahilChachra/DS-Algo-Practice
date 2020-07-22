// Insert node in cappropriate position
// 1 2 4 5
// input - 3, 3 should be in 1 2 3 4 5

#include<iostream>
#include<cstdlib>
using namespace std;
struct Node {
	int data;
	Node* next;
};
Node* head;

void insertNodeAtBeg(int a){
	Node* temp = new Node();	
	//Node* temp = (Node*)malloc(sizeof(Node*));
	temp->data = a;
	temp->next = head;
	head=temp;
}

void insertAtNpos(int a, int pos){
	Node* temp = new Node();
	temp->data = a;
	temp->next = NULL;
	if(pos==1){
		insertNodeAtBeg(a);
		return;
	}
	Node* curr = head;
	for(int i=0;i<pos-2;i++)
		curr = curr->next;
	temp->next = curr->next; //prev -> temp 
	curr->next = temp; // then temp -> next of prev
}

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

void insertNewNode(int a){

  Node *curr = head;
  
  if(a<curr->data){
    insertAtNpos(a,1);
    return;
  }
  int pos=1;
  while(curr!=NULL){
    if(a<curr->data){
      break;
    }
	pos = pos + 1;
	curr = curr->next;
  }
  insertAtNpos(a,pos);
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
	cin>>x;
	insertNewNode(x);
	print();
	head=NULL;
	}
	
	return 0;
}