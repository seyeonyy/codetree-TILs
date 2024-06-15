import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.next();
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = arr[i][j].toUpperCase();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}