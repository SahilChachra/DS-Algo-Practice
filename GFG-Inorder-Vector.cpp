void inorderFun(Node *root, vector <int> &res)
{
    if (root == NULL)
        return;
    
    inorderFun(root->left, res);
    res.push_back (root->data);
    inorderFun(root->right, res);
}
vector <int> inOrder(struct Node *root) {
    vector <int> res;
    inorderFun(root, res);
    return res;
}
