include<stack>
#include<queue>

void reversePrint(Node *root)
{
   queue<Node*> q;
   stack<int> stk;
   if(root==NULL)
    return;
   q.push(root);
   while(!q.empty()){
       Node *curr = q.front();
       q.pop();
       if(curr->right!=NULL) q.push(curr->right);
       if(curr->left!=NULL) q.push(curr->left);
       stk.push(curr->data);
   }
   while(!stk.empty()){
       cout<<stk.top()<<" ";
       stk.pop();
   }
}
