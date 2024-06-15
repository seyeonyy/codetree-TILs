import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[1000];
        int[] count = new int[1001];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            count[nums[i]]++;
        }
        int ans = 1001;
        for(int i = 1000; i >= 0; i--){
            if(count[i] >= 2){
                for(int j = 0; j < N; j++){
                    if(i == nums[j]){
                        ans = j+1;
                        System.out.print(ans + " ");
                        break;
                    }
                }
            }
            else{
                for(int j = 0; j < ans-1; j++){
                    if(i == nums[j]){
                        ans = j+1;
                        System.out.print(ans + " ");
                        break;
                    }
                }
            }
        }
    }
}