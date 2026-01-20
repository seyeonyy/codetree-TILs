import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static int n;
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(u == 1 || v == 1){
                count = -1;
            }
            graph[u].add(v); 
            graph[v].add(u);
            
        }
        DFS(1);
        System.out.println(count);
    }

    public static void DFS(int vertex){
        for(int i = 0; i < graph[vertex].size(); i++){
            int currV = graph[vertex].get(i);
            if(!visited[currV]){
                count++;
                visited[currV] = true;
                DFS(currV);
            }
        }
    }
}