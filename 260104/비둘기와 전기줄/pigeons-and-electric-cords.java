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
            if(counts[pigeon] >= 1 &&num[pigeon] == 0 && moveDir == 1){
                cnt++;
            }
            else if(counts[pigeon] >= 1&&num[pigeon] == 1 && moveDir == 0){
                cnt++;
            }
            num[pigeon] = moveDir;
            if(counts[pigeon] == 0){
                counts[pigeon] = 1;
            }else{
                counts[pigeon] += 1;
            }
        }
        System.out.println(cnt);
    }
}