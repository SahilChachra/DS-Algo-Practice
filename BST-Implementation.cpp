#include<iostream>
#include<queue>
using namespace std;

struct Node {
	int data; 
	Node* left;
	Node* right;
};

Node* GetNewNode(int data) {
	Node* newNode = new Node();
	newNode->data = data;
	newNode->left = newNode->right = NULL;
	return newNode;
}

Node* Insert(Node* root,int data) {
	if(root == NULL) { // empty tree
		root = GetNewNode(data);
	}
	 
	else if(data <= root->data) {
		root->left = Insert(root->left,data);
	}
	 
	else {
		root->right = Insert(root->right,data);
	}
	return root;
}

bool search(Node* root, int a){
	if(root==NULL)
		return false;
	if(root->data==a)
		return true;
	else if(a <= root->data) return search(root->left, a);
	else return search(root->right, a);
}

int findMin(Node* root){
	if(root==NULL){
		return -1;
	}
	
	else if(root->left == NULL){
		return root->data;
	}
	else
		return findMin(root->left);
}

int findMax(Node* root){
	if(root == NULL)
		return -1;
	else if(root->right==NULL)
		return root->data;
	else
		return findMax(root->right);
}

int findHeight(Node* root){
	if(root == NULL)
		return -1;
	return max(findHeight(root->left), findHeight(root->right)) + 1;
	
	/*
	
	if(root==NULL)
      return 0;
    else
      {
        int leftHeight = calculateHeight(root->left); 
        int rightHeight = calculateHeight(root->right);
        
        if(leftHeight>rightHeight)
          return leftHeight+1;
        else
          return rightHeight+1;
      }
	
	*/
}

int calculateSize(node* root)
{
    //write your code here
    if(root==NULL)
      return 0;
    else
      return (calculateSize(root->left) + 1 + calculateSize(root->right));
}	

void levelOrderTraversal(Node *root){
	if(root==NULL) return;
	
	queue<Node*> q;
	q.push(root);
	
	while(!q.empty()){
		Node *curr = q.front();
		cout<<curr->data<<" ";
		if(curr->left!=NULL) q.push(curr->left);
		if(curr->right!=NULL) q.push(curr->right);
		q.pop();
	}
	/*
	Time Complexity = O(n) for all cases
	Space Complexity = Rate of growth of extra memory
	Max amt used is = maximum size of q ever used
	O(1) - best - having only 1 child
	O(n) - perfect binary tree
	Worst and Avg - O(n)	
	*/
}

/*

Time complexity for Traversals below is O(n)
Space complexity 0 O(h) h is height of tree
Worst case Space Complexity is O(n)
and best/avg is O(logn)

*/

void preOrder(Node* root){
	if(root==NULL)
		return;
	else{
		cout<<root->data<<" ";
		preOrder(root->left);
		preOrder(root->right);
	}
}

void inOrder(Node *root){
	if(root==NULL) return;
	inOrder(root->left);
	cout<<root->data<<" ";
	inOrder(root->right);
}

void postOrder(Node* root){
	if(root==NULL) return
	postOrder(root->left);
	postOrder(root->right);
	cout<<root->data<<" ";
}

bool isBSUtil(Node*root, int min, int max){
	if(root==NULL) return true;
	
	if(root->data > min && root->data<max
	&& isBSUtil(root->left,min,root->data) &&
	isBSUtil(root->right, root->data, max))	
		return true;
	else
		false;
}

bool isBinarySearchTree(Node *root){
	return isBSUtil(root, INT_MIN, INT_MAX);
}

void averageOfAllLevels(Node* root){
	if(root==NULL)
		return;
		
	queue<Node*> q;
	q.push(root);
	
	while(!q.empty()){
		int sum=0,count=0;
		queue<Node*> t;
		while(!q.empty()){
			Node *curr = q.front();
			sum = sum + curr->data;
			q.pop();
			count++;
			if(curr->left!=NULL) t.push(curr->left);
			if(curr->right!=NULL) t.push(curr->right);
		}
		q = t;
		cout<<sum/count<<" ";
	}
}

int sum(node* root){
  if (root==NULL)
    return 0;
  else
    return sum(root->left) + root->value + sum(root->right);
}

bool checkSumTree(node* root)
{
    int ls,rs;
	
	if(root==NULL || root->left==NULL || root->right==NULL)
		return 1;
	
	ls = sum(root->left);
	rs = sum(root->right);
	
	if((root->value == ls+rs) && checkSumTree(root->left) && checkSumTree(root->right))
		return true;
	else
		return false;
	
}

Node* findLowestAncestor(Node* root,int v1, int v2)
{
    if(root->data > max(v1,v2))
      return findLowestAncestor(root->left, v1,v2);
    else if(root->data < min(v1,v2))
      return findLowestAncestor(root->right,v1,v2);
    else
      return root;
}

bool checkMirrorTree(node* a, node* b)
{
    
    if(a==NULL && b==NULL)
      return true;
    
    if(a==NULL && b!=NULL)
      return false;
    
    if(a!=NULL && b==NULL)
      return false;
    
    if(a->value == b->value){
      if(checkMirrorTree(a->left,b->right) && checkMirrorTree(a->right,b->left))
        return true;
    }
      return false;
}bool checkMirrorTree(node* a, node* b)
{
    
    if(a==NULL && b==NULL)
      return true;
    
    if(a==NULL && b!=NULL)
      return false;
    
    if(a!=NULL && b==NULL)
      return false;
    
    if(a->data == b->data){
      if(checkMirrorTree(a->left,b->right) && checkMirrorTree(a->right,b->left))
        return true;
    }
      return false;
}

int main() {
	Node* root = NULL; 
	root = Insert(root,15);	
	root = Insert(root,10);	
	root = Insert(root,20);
	root = Insert(root,25);
	root = Insert(root,8);
	root = Insert(root,12);
	
	int number;
	cout<<"Enter number be searched\n";
	cin>>number;

	if(search(root,number) == true) cout<<"Found\n";
	else cout<<"Not Found\n";
	return 0;
}
