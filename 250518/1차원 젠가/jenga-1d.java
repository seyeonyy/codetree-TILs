import java.util.Scanner;
public class Main {
    public static int N;
    public static int[] arr;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N+1];
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[N+1];
        int[] temp2 = new int[N+1];
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        for(int i = s1; i <= e1; i++){
            arr[i] = -1;
        }
        int idx = 1;
        for(int i = 1; i <= N; i++){
            if(arr[i] != -1){
                temp[idx] = arr[i];
                idx++;
            }
        }
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        for(int i = s2; i <= e2; i++){
            temp[i] = -1;
        }
        int idx2 = 1;
        for(int i = 1; i <= N; i++){
            if(temp[i] != -1){
                temp2[idx2] = temp[i];
                idx2++;
            }
        }
        int idx3 = 0;
        for(int i = 1; i <= idx2; i++){
            if(temp2[i] != 0){
                idx3++;
            }
        }
        System.out.println(idx3);
        for(int i = 1; i <= idx3; i++){
            System.out.println(temp2[i]);
        }
    }
}