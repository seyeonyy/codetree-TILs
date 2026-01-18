import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static int k;
    public static int n;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        choose(0);
    }

    public static void printAnswer(){
        for(int i = 0; i < n; i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }

    public static void choose(int currNum){
        if(currNum == n){
            if(n > 2){
                boolean t = true;
                for(int j = 1; j < n; j++){
                    if(answer.get(0) != answer.get(j)){
                        t = false;
                    }
                }
                if(!t){
                    printAnswer();
                }
            }else{
                printAnswer();
            }
            return;
        }

        for(int i = 1; i <= k; i++){
            answer.add(i);
            choose(currNum+1);
            answer.remove(answer.size()-1);
        }

    }
}