import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char firstFlu = sc.next().charAt(0);
        int firstTemp = sc.nextInt();

        char secondFlu = sc.next().charAt(0);
        int secondTemp = sc.nextInt();

        char thirdFlu = sc.next().charAt(0);
        int thirdTemp = sc.nextInt();

        if(firstFlu == 'Y' && firstTemp >= 37){
            if(secondFlu == 'Y' && secondTemp >= 37){
                System.out.println("E");
            }else if(thirdFlu == 'Y' && thirdTemp >= 37){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }else if(secondFlu == 'Y' && secondTemp >= 37){
            if(firstFlu == 'Y' && firstTemp >= 37){
                System.out.println("E");
            }else if(thirdFlu == 'Y' && thirdTemp >= 37){
                System.out.println("E");
            }else{
                System.out.println("N");
            }
        }else if(thirdFlu == 'Y' && thirdTemp >= 37){
            if(firstFlu == 'Y' && firstTemp >= 37){
                System.out.println("E");
            }else if(thirdFlu == 'Y' && thirdTemp >= 37){
                System.out.println("E");
            }else{
                System.out.println("N");
            }
        }else{
            System.out.println("N");
        }
    }
}