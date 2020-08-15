#include<iostream>
#include<vector>
using namespace std;

void addEdgeUndirected(vector<int> adj[],int u,int v){
	
	adj[u].push_back(v);
	adj[v].push_back(u);
	
}

void print(vector<int> adj[],int V){
	
	for(int i=0;i<V;i++){
		cout<<"Adjacency List of vertices for - " << i <<" : ";
		for(auto j = adj[i].begin(); j!=adj[i].end();j++)
			cout<<"-->"<<*j;
		cout<<endl;
	}
	
}

int main(){
	
	int V,u,v,E;
	cout<<"Enter number of Vertices and Edges : ";
	cin>>V>>E;
	vector<int> adj[V];
	for(int i=0;i<E;i++){
		cout<<"Enter Source vertex and Destination Vertex : ";
		cin>>u>>v;
		addEdgeUndirected(adj,u,v);
	}
	print(adj, V);
	
}
