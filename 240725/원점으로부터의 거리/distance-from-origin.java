import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x < 0){
                x = -x;
            }
            if(y < 0){
                y = -y;
            }
            int num = i+1;
            points[i] = new Point(x, y, num);
        }
        Arrays.sort(points);
        for(int i = 0; i < n; i++){
            System.out.println(points[i].num);
        }
    }
}
class Point implements Comparable<Point>{
    int x;
    int y;
    int num;
    int sum;
    public Point(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
        this.sum = x + y;
    }
    @Override
    public int compareTo(Point point){
        return this.sum - point.sum;
    }
}