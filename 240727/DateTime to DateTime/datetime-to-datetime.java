import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 11;
        int hour = 11;
        int minute = 11;
        int elapsedTime = 0;
        if(a <= day && b <= hour && c < minute){
            elapsedTime = -1;
        }else{
            while(true){
                if(day == a && hour == b && minute == c){
                    break;
                }
                minute++;
                elapsedTime++;
                if(minute == 60){
                    minute = 0;
                    hour++;
                }
                if(hour == 24){
                    hour = 0;
                    day++;
                }  
            }
        }
        System.out.print(elapsedTime);
    }
}