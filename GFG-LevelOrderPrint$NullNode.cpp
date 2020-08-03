void levelOrder(Node* root)
{
  queue<Node*> q;
  if(root==NULL)
    return;
    
  q.push(root);
  while(!q.empty()){
      int size = q.size();
      while(size--){
      Node *c = q.front();
      cout<<c->data<<" ";
      if(c->left!=NULL) q.push(c->left);
      if(c->right!=NULL) q.push(c->right);
      q.pop();
  }
  cout<<"$"<<" ";
  }
}
