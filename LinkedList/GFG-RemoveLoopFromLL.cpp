//REMOVE LOOP FROM LINKED LIST
// DETECT USING FLOYD's Algo

void deleteLoop(Node*head){
	
	if (head == NULL || head->next == NULL) 
        return; 
	
	Node *slow = head;
	Node *fast = head;
	int flag = 0;
	while(slow!=NULL && fast!=NULL && fast->next!=NULL){
		slow=slow->next;
		fast=fast->next->next;
		
		if(slow==fast){
			flag=1;
			break;
		}
	}
	if(flag==1 && slow==head && fast==head){
        while(slow->next!=head)
            slow=slow->next;
        slow->next=NULL;
    }
    
	else if(flag==1){
		slow=head;
		while(slow->next!=fast->next){
			slow=slow->next;
			fast=fast->next;
		}
		fast->next=NULL;
	}
	else
		return;
	
}
