#include<iostream>
#include<vector>
#include<queue>
#include<stack>
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

void DFS(vector<int> adj[], int src, int V){
	
	stack<int> s;
	int visited[V] = {0};
	vector<int>::iterator ptr; 
	
	s.push(src);
	
	cout<<"DFS Traversal : source - "<<src<<endl;
	
	while(!s.empty()){
		int p = s.top();
		s.pop();
		
		if(!visited[p]){
			visited[p]=1;
			cout<<p<<" ";
		}
		
		for (ptr=adj[p].begin(); ptr!=adj[p].end(); ++ptr) {
			if (!visited[*ptr]){
				s.push(*ptr);
			}	
		}
		
	}
	
}

void BFS(vector<int> adj[],int src,int V){
	
	queue<int> q;
	int visited[V] = {0};

	q.push(src);
	visited[src]=1;
	
	cout<<"BFS Traversal : source - "<<src<<endl;
	
	while(!q.empty()){
		
		int f = q.front();
		q.pop();
		cout<<f<<" ";
		
		for (int i=0; i<adj[f].size(); i++) {
			if (visited[adj[f][i]] == 0){
				q.push(adj[f][i]);
				visited[adj[f][i]] = 1;
			}	
		}
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
	int src;
	cout<<"Enter Source vertex for BFS & DFS : ";
	cin>>src;
	BFS(adj, src, V); cout<<endl;
	DFS(adj,src,v); cout<<endl;
	//print(adj, V);
	
}
