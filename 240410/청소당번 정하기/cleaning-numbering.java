import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classroomCnt = 0;
        int hallCnt = 0;
        int toiletCnt = 0;
        int sum = 0;

        for(int i = 0; i <=n; i++){
            if(i > 0){
                if(i % 12 == 0){
                    toiletCnt++;
                }else if(i % 3 == 0){
                    if(i % 12 != 0){
                        hallCnt++;
                    }
                }else if(i % 2 == 0){
                    if(i % 12 != 0 || i % 3 != 0){
                        classroomCnt++;
                    }
                }
            }
        }

        System.out.println(classroomCnt + " " + hallCnt + " " + toiletCnt);

    }
}