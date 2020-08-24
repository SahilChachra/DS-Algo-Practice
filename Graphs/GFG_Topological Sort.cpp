void topoSortUtil(vector<int> adj[],int curr, int visited[],stack<int> &stk){
	
	visited[curr]=1;
	
	vector<int>::iterator it;
	
	for(it=adj[curr].begin(); it!=adj[curr].end(); it++){
		if(!visited[*it]){
			topoSortUtil(adj, *it, visited, stk);
		}
	}
	stk.push(curr);
}

vector<int> topoSort(int V, vector<int> adj[]) {
    
    stack<int> stk;
    int visited[V]={0};
    
    for(int i=0;i<V;i++){
    	if(visited[i]==0)
    		topoSortUtil(adj, i, visited, stk);
	}
	vector<int> v;
	while(!stk.empty()){
	   int t = stk.top();
		v.push_back(t);
		stk.pop();
	}
    return v;
}
