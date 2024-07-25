import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence[] sequence = new Sequence[n];
        int[] arr = new int[n];
        int[] idx = new int[n];        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sequence[i] = new Sequence(num);
            arr[i] = num;
        }
        Arrays.sort(sequence);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == sequence[j].num){
                    idx[i] = j+1;
                }
            }
        }
        for(int i = n-1; i > 0; i--){
            int cnt = 1;
            for(int j = 0; j <= i-1; j++){
                if(idx[i] == idx[j]){
                     idx[j] = idx[i] - cnt;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(idx[i] + " ");
        }
    }
}
class Sequence implements Comparable<Sequence>{
    int num;
    public Sequence(int num){
        this.num = num;
    }
    @Override
    public int compareTo(Sequence sequence){
        return this.num - sequence.num;
    }
}