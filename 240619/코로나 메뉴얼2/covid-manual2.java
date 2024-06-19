import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        for(int i = 0; i < 3; i++){
            char flu = sc.next().charAt(0);
            int temp = sc.nextInt();
            if(flu == 'Y' && temp >= 37){
                count[0]++;
            }else if(flu == 'N' && temp >= 37){
                count[1]++;
            }else if(flu == 'Y' && temp < 37){
                count[2]++;
            }else if(flu == 'N' && temp < 37){
                count[3]++;
            }
        }
        for(int i = 0; i < 4; i++){
            System.out.print(count[i]+ " ");
        }
        if(count[0] >= 2){
            System.out.print("E");
        }
        
    }
}