import com.sun.istack.internal.Pool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ImplementDFS {

    ArrayList<ArrayList<Integer>> g;

    ImplementDFS(int v) {
        g = new ArrayList<>(v);
        for(int i =0;i<=v;i++){
            g.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        g.get(src).add(dest);
    }

    public void DFS_helper(int src,int[] visited) {
        visited[src] = 1;
        System.out.println(src+" ");

        Iterator<Integer> it = g.get(src).iterator();
        while(it.hasNext()) {
            int n = it.next();
            if(visited[n]==0){
                DFS_helper(n, visited);
            }
        }
    }

    public void DFS(int src) {
        int[] visited = new int[g.size()];
        Arrays.fill(visited, 0);

        DFS_helper(src, visited);
    }

    public void display() {

        for(int i = 0; i<g.size();i++) {
            if(!(g.get(i).size()>0))
                continue;
            System.out.print(i+" : ");
            for(int j = 0;j < g.get(i).size();j++) {
                System.out.print(g.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ImplementDFS d = new ImplementDFS(4);

        d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(2,3);
        d.addEdge(3,3);
        d.addEdge(2,0);



        d.display();
        System.out.println("DFS Traversal");
        d.DFS(2);

    }

}
