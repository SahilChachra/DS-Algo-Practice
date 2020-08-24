#include<iostream>
#include<vector>
using namespace std;

void addEdgeUndirected(vector<int> g[], int u, int v){
	g[u].push_back(v);
	g[v].push_back(u);
}

bool DFS(int index, int parent, int visited[], vector<int> g[]){
	
	visited[index]=1;
	
	vector<int> v = g[index];
	vector<int>::iterator it;
	
	for(it = v.begin(); it!=v.end();it++){
		if(!visited[*it]){
			DFS(*it, index, visited, g);
		}
		else if(*it!=parent)
			return true;
	}
	return false;
}

bool CheckIfCycle(vector<int> g[], int V){
	
	int visited[V] = {0};
	
	for(int i = 0;i < V;i++){
		if(!visited[i]){
			if(DFS(i,-1, visited, g)){
				return true;
			}
		}
	}
	return false;
}

int main(){
	
	int V,E;
	// t;
	//cout<<"Enter test cases : ";
	//cin>>t;
	//while(t--){
		//cout<<"Enter vertex and edge : ";
		cin>>V>>E;
		vector<int> g[V];
		int u,v;
		for(int i=0;i<E;i++){
			//cout<<"Enter Src and Dest : ";
			cin>>u>>v;
			addEdgeUndirected(g,u,v);
		}
		bool b = CheckIfCycle(g, V);
		if(b==1) cout<<"Yes";
		else cout<<"No";
	//}
}
