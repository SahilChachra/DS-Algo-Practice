struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};*/

// return the Height of the given Binary Tree
int height(Node* root)
{
    if(root==NULL)
        return 0;
   else
        return 1 + max(height(root->left), height(root->right));
}
