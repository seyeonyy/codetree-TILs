import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        int count = 0;
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == c){
                count++;
                sum += arr[i].length();
            }
        }
        avg = sum / count;
        System.out.printf("%d %.2f", count, avg);
    }
}