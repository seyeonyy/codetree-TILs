import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            sum += arr[i].length();
        }
        char c = 'a';
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == c){
                    count++;
                }
            }
        }
        System.out.println(sum + " " + count);
    }
}