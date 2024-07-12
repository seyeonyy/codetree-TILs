import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(day(M,D) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean month(int M){
        for(int i = 1; i <= 12; i++){
            if(M == i){
                return true;
            }
        }
        return false;
    }
    public static boolean day(int M,int D){
        if(month(M) == false){
            return false;
        }else{
            if(M == 1 || M == 3 || M == 5|| M == 7 || M == 8 || M == 10 || M == 12){
                for(int i = 1; i <= 31; i++){
                    if(D == i){
                        return true;
                    }
                }
            }else if(M == 2){
                for(int i = 1; i <= 28; i++){
                    if(D == i){
                        return true;
                    }
                }
            }else{
                for(int i = 1; i <= 30; i++){
                    if(D == i){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}