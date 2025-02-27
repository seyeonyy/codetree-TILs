import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int cnt = 0;
        while(true){
            if(m1 == m2 && d1 == d2) {
                System.out.println(day[cnt]);
                break;
            }
            if(m1 > m2 || (m1 == m2 && d1 > d2)){
                d1--;
                cnt--;
                if(cnt < 0){
                    cnt = 6;
                }
                if(d1 == 0){
                    m1--;
                    d1 = days[m1];
                }
            }else{
                d1++;
                cnt++;
                if(cnt == 7){
                    cnt = 0;
                }
                if(d1 > days[m1]){
                    d1 = 1;
                    m1++;
                }
            }
        }
    }
}