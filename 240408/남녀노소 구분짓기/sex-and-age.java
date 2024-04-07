import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex == 0){
            if(age >= 19){
                System.out.println("MAN");
            }else{
                System.out.println("BOY");
            }
        }else{
            if(age>= 19){
                System.out.println("WOMAN");
            } else{
                System.out.println("GIRL");
            }
        }
    }
}