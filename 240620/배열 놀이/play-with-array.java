import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[100];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++){
            int num = sc.nextInt();
            int idx = 0;
            if(num == 1){
                int a = sc.nextInt();
                System.out.print(arr[a-1]);
            }else if(num == 2){
                int b = sc.nextInt();
                for(int k = 0; k < n; k++){
                    if(arr[k] == b){
                        idx = k+1;
                        break;
                    }
                }
                System.out.print(idx);
            }else if(num == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j = s-1; j < e; j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
}