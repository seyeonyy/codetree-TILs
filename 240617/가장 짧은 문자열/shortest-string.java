import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int s1 = str1.length();
        int s2 = str2.length();
        int s3 = str3.length();
        int[] arr = new int[]{s1, s2, s3};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < 3; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
}