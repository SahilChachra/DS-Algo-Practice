struct Node {
    int data;
    Node *left;
    Node *right;
}

int diameter(Node root, int res) {

    if(root==NULL)
        return 0;

    int l = diameter(root->left, res);
    int r = diameter(root->right, res);

    int temp = math.max(l,r)+1;
    int ans = max(temp, 1+l+r);
    res = max(res, ans);

    return res;
}
//pass res = INT_MIN
