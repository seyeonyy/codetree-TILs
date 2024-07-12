import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(season(Y,M,D).equals("xx")){
            System.out.println(-1);
        }else{
            System.out.println(season(Y,M,D));
        }
    }
    public static boolean year(int Y){
        if(Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0){
            return true;
        }
        return false;
    }
    public static int day(int Y, int M){
        if(M == 2){
            if(year(Y)){
                return 29;
            }else{
                return 28;
            }
        }else if(M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 1 || M == 12){
            return 31;
        }
        return 30;
    }
    public static String season(int Y, int M, int D){
        if(D <= day(Y,M)){
            if(3 <= M && M <= 5){
                return "Spring";
            }else if(6 <= M && M <= 8){
                return "Summer";
            }else if(9 <= M && M <= 11){
                return "Fall";
            }else{
                return "Winter";
            }
        }
        return "xx";
    }
}