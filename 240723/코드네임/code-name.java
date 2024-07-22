import java.util.Scanner;
class Agent{
    char codeName;
    int score;
    Agent(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++){
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
        }
        int minScore = agents[0].score;
        int idx = 0;
        for(int i = 0; i < 5; i++){
            if(minScore > agents[i].score){
                minScore = agents[i].score;
                idx = i;
            }
        }
        System.out.println(agents[idx].codeName + " " + agents[idx].score);
    }
}