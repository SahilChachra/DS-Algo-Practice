import java.util.*;

public class ImplementBFS {

    ArrayList<ArrayList<Integer>> g;

    ImplementBFS(int v) {
        g = new ArrayList<>(v);
        for(int i=0;i<v;i++) {
            g.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        g.get(src).add(dest);
    }

    public void BFS(int src) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[g.size()];
        Arrays.fill(visited, 0);

        visited[src] = 1;
        q.add(src);

        while(q.size()!=0) {
            int f = q.poll();
            System.out.print(f+" ");

            Iterator<Integer> it = g.get(f).iterator();
            while(it.hasNext()) {
                int u = it.next();
                if(visited[u]==0) {
                    visited[u]=1;
                    q.add(u);
                }
            }
        }

    }

    public void display() {

        for(int i = 0;i<g.size();i++) {
            if(!(g.get(i).size()>0))
                continue;
            System.out.print(i+" : ");
            for(int j = 0;j<g.get(i).size();j++) {
                System.out.print(g.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ImplementBFS bfs = new ImplementBFS(8);

        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);
        bfs.addEdge(2,0);



        bfs.display();
        System.out.println("BFS Traversal");
        bfs.BFS(2 );

    }

}
