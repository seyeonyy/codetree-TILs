import java.util.Scanner;
class Save{
    String id;
    int lv;
    Save(String id, int lv){
        this.id = id;
        this.lv = lv;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int lv = sc.nextInt();
        Save s1 = new Save("codetree", 10);
        Save s2 = new Save(id, lv);
        System.out.println("user " + s1.id + " lv " + s1.lv);
        System.out.println("user " + s2.id + " lv " + s2.lv);
    }
}