#include<stack>

void left_BDR(Node *root, vector<int> &v){
	if(root){
		if(root->left){
			v.push_back(root->data);
			left_BDR(root->left,v);
		}
		else if(root->right){
			v.push_back(root->data);
			left_BDR(root->right, v);
		}
	}
}

void right_BDR(Node *root, vector<int> &v){
	stack<int> s;
	while(root){
	    if(root->left || root->right)
	           s.push(root->data);
	   if(root->right) root=root->right;
	   else root=root->left;
	}
	while(!s.empty()){
	    v.push_back(s.top());
	     s.pop();
	}
}

void leaf(Node *root, vector<int> &v){
	if(root)
	{
	    leaf(root->left, v);
    	if(!(root->left) && !(root->right))
    	    v.push_back(root->data);
    	leaf(root->right, v);
	}
}

vector <int> printBoundary(Node *root)
{
     vector<int> v;
     if(root==NULL)
        return v;
     v.push_back(root->data);
     left_BDR(root->left,v);
     leaf(root,v);  //leaf(root->right,v);
     
     right_BDR(root->right,v);
     return v;
}
