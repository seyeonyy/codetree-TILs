import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i = 0; i < n1; i++){
            if(idx == n2){
                break;
            }
            if(arr1[i] == arr2[idx]){
                idx++;
            }else{
                idx = 0;
            }
        }
        if(idx == 0){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
    }
}