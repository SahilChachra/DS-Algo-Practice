#include<iostream>
#include<vector>
using namespace std;

void addEdgeUndirected(vector<int> g[], int u, int v){
	g[u].push_back(v);
	g[v].push_back(u);
}

void DFSUtil(vector<int> g[],int v, int visited[]){
	
	visited[v] = 1;
	
	vector<int>::iterator i;
	
	for(i=g[v].begin(); i!=g[v].end(); i++){
		if(!visited[*i])
			DFSUtil(g, *i, visited);
	}
	
}

void countConnected(vector<int> g[], int V){
	
	int visited[V] = {0};
	int c;
	for(int v=0;v<V;v++){
		if(visited[v]==0){
			DFSUtil(g, v, visited);
			c=c+1;
			//cout<<endl;
		}
	}
	//cout<<"Count : "<<c<<endl;
	cout<<c<<endl;
	delete[] visited;
	
}

int main(){
	
	int V,E;
	int t;
	//cout<<"Enter test cases : ";
	cin>>t;
	while(t--){
		//cout<<"Enter vertex and edge : ";
		cin>>V>>E;
		vector<int> g[V];
		int u,v;
		for(int i=0;i<E;i++){
			//cout<<"Enter Src and Dest : ";
			cin>>u>>v;
			addEdgeUndirected(g,u,v);
		}
		countConnected(g, V);
	}
	
}
