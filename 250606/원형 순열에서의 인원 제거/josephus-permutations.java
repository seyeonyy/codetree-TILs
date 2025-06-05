import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int i = 0; i < N; i++){
            q.add(i+1);
        }
        while(!q.isEmpty()){
            for(int i = 0; i < K; i++){
                if(i == K-1){
                    System.out.print(q.poll() + " ");
                }else{
                    q.add(q.poll());
                }
            }
        }        
    }
}