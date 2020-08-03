/* Tree node structure  used in the program
 struct Node
 {
     int data;
     Node* left;
     Node* right;
}; */

/* Computes the number of nodes in a tree. */
int getSize(Node* root)
{
   if(root==NULL)
    return 0;
    else
        return getSize(root->left) + getSize(root->right) + 1;
}
