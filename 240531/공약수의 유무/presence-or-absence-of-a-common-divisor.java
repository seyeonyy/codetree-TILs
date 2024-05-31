import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int exists = 0;
        for(int i = a; i <= b; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                exists = 1;
            }
        }
        if(exists == 1){
            System.out.println(exists);
        }else{
            System.out.println(exists);
        }
    }
}