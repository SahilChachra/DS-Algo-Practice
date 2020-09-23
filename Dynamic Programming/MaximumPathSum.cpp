struct Node {
    int data;
    Node *left;
    Node *right;
}

int max(int a, int b) {
    if(a>b)
    return a;
    else return b;
}

int diameter(Node root, int res) {

    if(root==NULL)
        return 0;

    int l = diameter(root->left, res);
    int r = diameter(root->right, res);

    int temp = max(max(l,r) + root->data, root->data);
    if(root->left==NULL && root->right==NULL)
        temp = max(temp, root->data)
    int ans = max(temp, l+r+root->data);
    res = max(res, ans);

    return res;
}

//pass res = INT_MIN

