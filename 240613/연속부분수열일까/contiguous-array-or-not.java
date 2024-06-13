import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int count = 0;
        boolean progression = true;

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            for(int j = 0; j < n1; j++){
                if(arr1[j] != arr2[i]){
                    count++;
                    break;
                }
            }
        }
        for(int i = count-1; i < n1-count; i++){
            for(int j = 0; j < n2; j++){
                if(i == j){
                    if(arr1[i] != arr2[j]){
                        progression  = false;
                        break;
                    }
                }
            }
        }
        if(progression == false){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}