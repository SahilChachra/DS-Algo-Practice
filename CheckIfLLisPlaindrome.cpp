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

void insertNode(int a){
	
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

int checkPalin(int c){
	Node *currRev = head;
	Node *currFor = head;
	while(currRev->next!=NULL){
		currRev=currRev->next;
	}
	
	int ctr=0;
	while(ctr<=c){
		if(currRev->data == currFor->data){
			//cout<<"Rev : "<<currRev->data<<"For : "<<currFor->data<<endl;
			currRev=currRev->prev;
			currFor = currFor->next;
			ctr+=1;
		}
		else{
			return 0;
		}
	}
	return 1;
}

int main(){
	int t;
	cin>>t;
	while(t--){
	int n;
	//cout<<"Enter number of nodes : ";
	cin>>n;
	
	int i,x, c=0;
	
	if(n==1){
		int y;
		cin>>y;
		cout<<"true"<<endl;
		continue;
	}
	
	if(n%2==0)
      c = (n/2) - 1;
    else
      c = (n/2);
	
	for(i=0;i<n;i++){
		cin>>x;
		insertNode(x);
	}
	//printForward();
	int b = checkPalin(c);
	if(b==0) cout<<"false"<<endl;
	else cout<<"true"<<endl;
	head = NULL;
	}
	
	return 0;
}