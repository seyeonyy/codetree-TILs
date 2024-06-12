import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] flu = new char[4];
        int[] temp = new int[4];
        char[] sym = new char[4];
        int[] count = new int[4];
        
        for(int i = 0; i < 4; i++){
            if(i == 3){
                break;
            }
            flu[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
        }

        for(int i = 0; i < 4; i++){
            if(flu[i] == 'Y' && temp[i] >= 37){
                sym[i] = 'A';
                count[0]++;
            }else if(flu[i] == 'N' && temp[i] >= 37){
                sym[i] = 'B';
                count[1]++;
            }else if(flu[i] == 'Y' && temp[i] < 37){
                sym[i] = 'C';
                count[2]++;
            }else if(flu[i] == 'N' && temp[i] < 37){
                sym[i] = 'D';
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