import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[11];
        int[] counts = new int[11];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();
            num[pigeon] += moveDir;
            if(counts[pigeon] > 0){
                counts[pigeon] += 1;
            }else{
                counts[pigeon] = 1;
            }
        }
        for(int i = 1; i <= 10; i++){
            if(counts[i] > 1){
                if(num[i] > 0){
                    cnt += num[i];
                }
            }
        }
        System.out.println(cnt);
    }
}