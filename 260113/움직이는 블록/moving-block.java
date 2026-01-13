import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(blocks);
        int cnt = 0;
        while(blocks[0] != blocks[n-1]){
            blocks[0] += 1;
            blocks[n-1] -= 1;
            cnt++;
            Arrays.sort(blocks);
        }
        System.out.println(cnt);
    }
}