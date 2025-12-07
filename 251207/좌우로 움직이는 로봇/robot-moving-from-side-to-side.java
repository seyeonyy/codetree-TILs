import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];
        int N = sc.nextInt();
        int M = sc.nextInt();

        int cnt1 = 0;
        int num1 = 50000;
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            char a2 = sc.next().charAt(0);
            if(a2 == 'L'){
                for(int j = 0; j < a; j++){
                    num1 -= 1;
                    arr1[cnt1] = num1;
                    cnt1++;
                }
            }else{
                for(int j = 0; j < a; j++){
                    num1 += 1;
                    arr1[cnt1] = num1;
                    cnt1++;
                }
            }
        }
        int cnt2 = 0;
        int num2 = 50000;
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            char a2 = sc.next().charAt(0);
            if(a2 == 'L'){
                for(int j = 0; j < a; j++){
                    num2 -= 1;
                    arr2[cnt2] = num2;
                    cnt2++;
                }
            }else{
                for(int j = 0; j < a; j++){
                    num2 += 1;
                    arr2[cnt2] = num2;
                    cnt2++;
                }
            }
        }

        int num = 0;
        int cnt = 0;
        if(cnt1 < cnt2){
            num = arr1[cnt1-1];
            for(int k = 1; k < cnt2; k++){
                if(k > cnt1){
                    if(num != arr2[k-1] && num == arr2[k]){
                        cnt++;
                    }
                }
                else if(arr1[k-1] != arr2[k-1] && arr1[k] == arr2[k]){
                    cnt++;
                }
            }
        }else{
            num = arr2[cnt2-1];
            for(int k = 1; k < cnt1; k++){
                if(k > cnt2){
                    if(num != arr1[k-1] && num == arr1[k]){
                        cnt++;
                    }
                }else if(arr1[k-1] != arr2[k-1] && arr1[k] == arr2[k]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}