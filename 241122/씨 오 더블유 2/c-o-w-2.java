import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr = new char[N];
        String s = sc.next();
        for(int i = 0; i < N; i++){
            arr[i] = s.charAt(i);
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == 'C'){
                for(int j = i+1; j < N; j++){
                    if(arr[j] == 'O'){
                        for(int k = j+1; k < N; k++){
                            if(arr[k] == 'W'){
                                count++;
                            }
                        }
                    }
                }
            }  
        }
        System.out.println(count);
    }
}