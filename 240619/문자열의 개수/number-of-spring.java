import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[201];
        int count = 0;
        for(int i = 0; i < 200; i++){
            String s = sc.next();
            if(s.equals("0")){
                break;
            }
            arr[count] = s;
            count++;
        }
        System.out.println(count);
        for(int i = 0; i < count; i++){
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}