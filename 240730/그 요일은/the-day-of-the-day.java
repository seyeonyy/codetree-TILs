import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        String[] dow = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 1;
        int count = 0;
        if(m1 == m2 && d1 == d2){
            if(A.equals("Mon")){
                count++;
            }
        }else{
            while(true){
                if(A.equals("Mon")){
                    if(dow[day].equals(A)){
                        count++;
                    }
                    day++;
                    d1++;
                    if(day == 7){
                        day = 0;
                    }
                    if(m1 == m2 && d1 == d2){
                        break;
                    }
                    if(days[m1] == d1){
                        d1 = 0;
                        m1++;
                    }
                }else{
                    day++;
                    d1++;
                    if(day == 7){
                        day = 0;
                    }
                    if(dow[day].equals(A)){
                        count++;
                    }
                    if(m1 == m2 && d1 == d2){
                        break;
                    }
                    if(days[m1] == d1){
                        d1 = 0;
                        m1++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}