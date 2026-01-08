import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int max = 0;
        int[] first1 = new int[n];
        int[] second1 = new int[n];
        for(int i = 0; i < n; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            first1[i] = first;
            second1[i] = second;
        }
        for(int i = 0; i < n; i++){
            if(first1[i] == 3 && second1[i] == 1){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 2){
                cnt++;
            }else if(first1[i] == 1 && second1[i] == 2){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        cnt = 0;
        for(int i = 0; i < n; i++){
            if(first1[i] == 1 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 2 && second1[i] == 1){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 2){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        cnt = 0;

        for(int i = 0; i < n; i++){
            if(first1[i] == 1 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 2 && second1[i] == 1){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 2){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        cnt = 0;

        for(int i = 0; i < n; i++){
            if(first1[i] == 1 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 2 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 1){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        cnt = 0;

        for(int i = 0; i < n; i++){
            if(first1[i] == 1 && second1[i] == 2){
                cnt++;
            }else if(first1[i] == 2 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 1){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        cnt = 0;

        for(int i = 0; i < n; i++){
            if(first1[i] == 1 && second1[i] == 3){
                cnt++;
            }else if(first1[i] == 2 && second1[i] == 1){
                cnt++;
            }else if(first1[i] == 3 && second1[i] == 2){
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        
        System.out.println(max);
    }
}