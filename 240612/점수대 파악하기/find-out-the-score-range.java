import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] score = new int[100];
        int[] count = new int[11];

        for(int i = 0; i < 100; i++){
            score[i] = sc.nextInt();
            if(score[i] == 0){
                break;
            }
            if(score[i] >= 10){
                count[score[i] / 10]++;
            }
        }
        for(int i = 10; i > 0; i--){
            System.out.println(i+"0 - " + count[i]);
        }
    }
}