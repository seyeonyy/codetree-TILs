import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.
        int cnt = 1;
        int min = seats.length();
        int max = -1;
        for(int i = 0; i < N; i++){
            if(seats.charAt(i) == '0'){
                cnt++;
            }else{
                cnt = 1;
            }
            if(seats.charAt(1) == '1'){
                max = cnt;
                break;
            }
            max = Math.max(max, cnt);
        }
        if(max == 1){
            System.out.println(max);
        }else{
            System.out.println(max/2);
        }
        //System.out.println(max/2);
        // for(int i = 0; i < seats.length(); i++){
        //     if(seats.charAt(i) == 0){
        //         cnt++;
        //     }else{
        //         cnt = 1;
        //     }
        //     min = Math.min(min, cnt);
        // }
    }
}