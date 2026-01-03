import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int a = x1; a <= x2; a++){
                if(arr[a] != 0){
                    arr[a]++;
                }else{
                    arr[a] = 1;
                }
            }
        }
        int tf = -1;
        for(int i = 1; i <= 100; i++){
            if(arr[i] == n-1){
                tf = 1;
            }
        }
        if(tf > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}