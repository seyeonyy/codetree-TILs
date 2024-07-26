import java.util.Scanner;
import java.util.Arrays;
class Agent implements Comparable<Agent>{
    char codeName;
    int score;
    public Agent(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
    public int compareTo(Agent agent){
        return this.score - agent.score;
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
        Arrays.sort(agents);
        System.out.println(agents[0].codeName + " " + agents[0].score);
    }
}