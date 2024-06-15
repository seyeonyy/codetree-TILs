import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[2][4];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        
        for(int i = 0; i < 2; i++){
            double width_sum = 0;
            for(int j = 0; j < 4; j++){
                width_sum += arr[i][j]; 
            }
            System.out.printf("%.1f ", width_sum/4);
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            double length_sum = 0;
            for(int j = 0; j < 2; j++){
                length_sum += arr[j][i];
            }
            System.out.printf("%.1f ", length_sum/2);
        }
        System.out.println();
        double sum = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
            }
        }
        System.out.printf("%.1f", sum/8);
        
    }
}