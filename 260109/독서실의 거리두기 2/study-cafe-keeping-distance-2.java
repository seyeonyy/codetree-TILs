import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.
        int cnt = 1;
        int max = -1;
        if(seats.charAt(n-1) != '1'){
            for(int i = 1; i < n; i++){
                if(seats.charAt(1) == '1'){
                    cnt = 1;
                    break;
                }else if(seats.charAt(i) == '0'){
                    cnt++;
                }else{
                    cnt = 1;
                }
            max = Math.max(max, cnt/2);
            }
            cnt = 1;
            for(int i = n-2; i >= 0; i--){
                if(seats.charAt(i) == '1'){
                    break;
                }else{
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }else if(seats.charAt(n-1) == '1'){
            for(int i = 1; i < n; i++){
                if(seats.charAt(1) == '1'){
                    cnt = 1;
                    break;
                }else if(seats.charAt(i) == '0'){
                    cnt++;
                }else{
                    cnt = 1;
                }
                max = Math.max(max, cnt/2);
            }
        }else if(seats.charAt('1') == '1'){
            cnt = 1;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}