import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] arr = new int[200];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+100;
            x2[i] = sc.nextInt()+100;
        }
        for(int i = 0; i < n; i++){
            for(int j = x1[i]; j <= x2[i]-1; j++){
                arr[j] += 1;
            }
        }
        int max = 0;
        for(int i = 0; i < 200; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        
        // Please write your code here.
    }
}