import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even = 0;
        int odd = 0;
        int sub = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 1){
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        if(even >= odd){
            sub = even - odd;
        }else{
            sub = odd - even;
        }
        System.out.println(sub);
    }
}