import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int num = 0;
        for(int i = 0; i < n.length(); i++){
            num = num * a + n.charAt(i)-'0';
        }
        int[] nums = new int[20];
        int cnt = 0;
        while(true){
            if(num < 1){
                break;
            }
            nums[cnt++] = num % b;
            num /= b;
        }
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(nums[i]);
        }
    }
}