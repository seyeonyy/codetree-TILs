import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int arr2 = sc.nextInt();
                if(arr1[i][j] == arr2){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}