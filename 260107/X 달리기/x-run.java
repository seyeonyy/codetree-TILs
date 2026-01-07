import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Please write your code here.
        int s = 1;
        int d = 0;
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < x; i++){
            d += s;
            if(d >= x){
                if(s == 1 && d == x){
                    cnt2++;
                    break;
                }
                if(s != 1){
                    d -= s;
                    s-=cnt;
                }
                cnt2--;
            }
            if(d == x-1){
                s = 1;
            }else{
                s++;
            }
            if(s < 0){
                s = Math.abs(s);
            }
            cnt++;
            cnt2++;
        }
        System.out.println(cnt2);
    }
}