Node *findMin(Node *root1){
    Node *root=root1;
    while(root && root->left!=NULL){
        root=root->left;
    }
    return root;
}

Node *deleteNode(Node *root,  int x)
{
    if(root==NULL) return NULL;
    
    if(x < root->data) root->left = deleteNode(root->left, x);
    else if(x > root->data) root->right = deleteNode(root->right, x);
    else {
        if(root->left==NULL){
            Node *t = root->right;
            delete root;
            return t;
        }
        else if(root->right==NULL){
            Node *t = root->left;
            delete root;
            return t;
        }
        else {
            Node *t = findMin(root->right);
            root->data = t->data;
            root->right = deleteNode(root->right, t->data);
        }
    }
    return root;
}
