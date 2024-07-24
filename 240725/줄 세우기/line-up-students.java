import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int num = i+1;
            students[i] = new Student(h, w, num);
        }
        Arrays.sort(students);
        for(int i = 0; i < n; i++){
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].num);
        }
    }
}
class Student implements Comparable<Student>{
    int h;
    int w;
    int num;
    public Student(int h, int w, int num){
        this.h = h;
        this.w = w;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if(student.h == this.h){
            if(student.w == this.w){
                return this.num - student.num;
            }
            return student.w - this.w;
        }
        return student.h - this.h;
    }
}