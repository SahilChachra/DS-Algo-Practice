#include<iostream>
using namespace std;

struct Node{
	int data;
	struct Node *next;
};

Node *head;

bool checkCycle(){
	
	//Flyod's Algorithm
	//Use slow and fast pointer
	//if slow = curr, fast = curr->next->next
	//Fast pointer Points 2 nodes ahead than slow pointer
	//If cycle exists, in the end slow and head will be as same position
	//or else we will encounter NULL and we will break the loop
	//meaning the linkedlist does not has Cycle
	
	Node *slow = head;
	Node *fast = head;
	
	while(slow!=NULL && fast!=NULL && fast->next!=NULL){
		slow = slow->next;
		fast = fast->next->next;
		
		if(slow==fast){
			cout<<"Cycle exists"<<endl;
			return true;
		}
	}
	return false;
	
	
}

int main(){
	
	//Accept length of linked list
	// Input elements and add as per
	// front or behind
	//create print func	
	
}
