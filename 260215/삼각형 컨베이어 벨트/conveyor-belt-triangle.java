import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[3*N];
        for(int i = 0; i < 3*N; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        while(T != 0){
            temp = arr[3*N-1];
            for(int i = 3*N-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            T--;
        }
        for(int i = 0; i < 3*N; i++){
            if(i != 0){
               if(i % N == 0){
                System.out.println();
                } 
            }
            System.out.print(arr[i] + " ");
        }
    }
}