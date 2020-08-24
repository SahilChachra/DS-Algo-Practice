bool isCycleUtil(vector<int> g[],int visited[], int currNode,int parent){
    
    visited[currNode] = 1;
    
    vector<int>::iterator it;
    
    for(it=g[currNode].begin();it!=g[currNode].end();it++){
        if(!visited[*it]){
            if(isCycleUtil(g,visited,*it,currNode))
                return true;
        }
        else if(*it!=parent)
            return true;
    }
    return false;
    
}

bool isCyclic(vector<int> g[], int V)
{
   int visited[V] ={0};
   int parent=-1;
   for(int i =0;i<V;i++){
       if(!visited[i])
        if(isCycleUtil(g,visited,i,parent))
            return true;
   }
   return false;
   
}
