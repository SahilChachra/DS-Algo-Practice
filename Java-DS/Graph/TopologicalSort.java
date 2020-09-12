import java.util.*;

public class TopologicalSort {
    public int V;
    public ArrayList<ArrayList<Integer>> adj;

    TopologicalSort(int v)
    {
        V=v;
        adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
    }
    void addEdge(int v,int w)
    {
        adj.get(v).add(w);
    }
    void topologicalSortUtil(int v, boolean visited[],Stack<Integer> stack)
    {
        visited[v]=true;
        Integer i;
        Iterator<Integer> it=adj.get(v).iterator();
        while(it.hasNext())
        {
            i=it.next();
            if(!visited[i])
                topologicalSortUtil(i,visited,stack);
        }
        stack.push(new Integer(v));
    }
    void topologicalSort()
    {
        Stack<Integer> stack=new Stack<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
            visited[i]=false;

        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        int edges=sc.nextInt();
        TopologicalSort g = new TopologicalSort(vertices);
        for(int j=0;j<edges;j++)
        {
            int src=sc.nextInt();
            int dest=sc.nextInt();
            g.addEdge(src, dest);
        }
        System.out.println("Following is a Topological " +"sort of the given graph");
        g.topologicalSort();
        sc.close();
    }

}
