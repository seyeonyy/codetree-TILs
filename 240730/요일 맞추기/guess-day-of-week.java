import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String[] dow = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 1;
        if(m2 == m1 && d2 == d1){
            day = 1;
        }
        else if(m2 <= m1 || d2 < d1){
            while(true){
                day--;
                d1--;
                if(m1 == m2 && d1 == d2){
                    break;
                }
                if(d1 == 1){
                    m1--;
                    d1 = days[m1]+1;
                }
                if(day == 0){
                    day = 7;
                }
            }
        }else{
            while(true){
                d1++;
                day++;
                if(m1 == m2 && d1 == d2){
                    break;
                }
                if(days[m1] == d1){
                    m1++;
                    d1 = 0;   
                }
                if(day == 7){
                    day = 0;
                }
            }
        }
        System.out.println(dow[day]);
    }
}