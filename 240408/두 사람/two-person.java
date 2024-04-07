import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int firstAge = sc.nextInt();
        char firstSex = sc.next().charAt(0);

        int secondAge = sc.nextInt();
        char secondSex = sc.next().charAt(0);

        if(firstAge >= 19 && firstSex == 'M' || secondAge >= 19 && secondSex == 'M'){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}