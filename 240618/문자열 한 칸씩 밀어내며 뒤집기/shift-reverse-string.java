import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();
        char[] arr = new char[len];
        for(int i = 0; i < q; i++){
            int n = sc.nextInt();
            if(n == 1){
                str = str.substring(1) + str.substring(0,1);
            }else if(n == 2){
                str = str.substring(len-1) + str.substring(0,len-1);
            }else if(n == 3){
                for(int k = 0; k < len; k++){
                    for(int j = len-1-k; j > len-1-k-1; j--){
                        arr[k] = str.charAt(j);
                    }
                }
                str = String.valueOf(arr);             
            }
            System.out.println(str);
        }
    }
}