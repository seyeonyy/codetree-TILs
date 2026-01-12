import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        a[0] = 0;
        b[0] = 0;
        c[0] = 0;
        for (int i = 1; i <= n; i++) {
            char ca = sc.next().charAt(0);
            int s = sc.nextInt();
            if(ca == 'A'){
                a[i] = a[i-1] + s;
            }
            if(ca == 'B'){
                b[i] = b[i-1] + s;
            }
            if(ca == 'C'){
                c[i] = c[i-1] + s;
            }
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(a[i-1] == b[i-1] && b[i-1] == c[i-1]){
                if(a[i] != b[i] || b[i] != c[i]){
                    //System.out.println(1);
                    cnt++;
                }
            }else if(a[i-1] > b[i-1] && b[i-1] >= c[i-1] || a[i-1] > c[i-1] && c[i-1] >= b[i-1]){
                if(b[i] > c[i] && c[i] >= a[i] || b[i] > a[i] && a[i] >= c[i] || c[i] > a[i] && a[i] >= b[i] || c[i] > b[i] && b[i] >= a[i] || a[i] == b[i] && b[i] == c[i]){
                    //System.out.println(2);
                    cnt++;
                }
            }else if(b[i-1] > c[i-1] && c[i-1] >= a[i-1] || b[i-1] > a[i-1] && a[i-1] >= c[i-1]){
                if(a[i] > b[i] && b[i] >= c[i] || a[i] > c[i] && c[i] >= b[i] || c[i] > a[i] && a[i] >= b[i] || c[i] > b[i] && b[i] >= a[i] || a[i] == b[i] && b[i] == c[i]){
                    //System.out.println(3);
                    cnt++;
                }
            }else if(c[i-1] > a[i-1] && a[i-1] >= b[i-1] || c[i-1] > b[i-1] && b[i-1] >= a[i-1]){
                if(a[i] > b[i] && b[i] >= c[i] || a[i] > c[i] && c[i] >= b[i] || b[i] > a[i] && a[i] >= c[i] || b[i] > c[i] && c[i] >= a[i] && a[i] == b[i] && b[i] == c[i]){
                    //System.out.println(4);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}