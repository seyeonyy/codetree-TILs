import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] b1 = new int[n];
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if(c == 'A'){
                a1[i] += s;
            }else{
                b1[i] += s;
            }
        }
        int cnt = 0;
        if(a1[0] == 0 && b1[0] == 0){
            cnt = 0;
        }else{
            cnt = 1;
        }
        for(int i = 1; i < n; i++){
            if(a1[i-1] < b1[i-1]){
                if(a1[i] >= b1[i]){
                    cnt++;
                }
            }else{
                if(a1[i] < b1[i]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}