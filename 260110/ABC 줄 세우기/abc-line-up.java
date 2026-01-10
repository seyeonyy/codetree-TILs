import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        // Please write your code here.
        char[] arr2 = new char[26];
        for(int i = 0; i < 26; i++){
            arr2[i] = (char)(65+i);
            //System.out.println(arr2[i]);
        }
        int cnt = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr2[i]){
                char tmp = 'a';
                for(int j = i+1; j < n; j++){
                    if(arr[j] == arr2[i]){
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}