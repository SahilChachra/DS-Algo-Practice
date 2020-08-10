int height(Node *root){
    if(root==NULL) return 0;
    else
        return max(height(root->left), height(root->right)) + 1;
}

int max(int a, int b){
    if(a>=b) return a;
    else
        return b;
}

int diameter(Node* root) {
    
    if (root==NULL) return 0;
    
    int lheight = height(root->left);
    int rheight = height(root->right);
    
    int ldiameter = diameter(root->left);
    int rdiameter = diameter(root->right);
    
    int fd = max(lheight+rheight+1, max(ldiameter, rdiameter));
    return fd;
}
