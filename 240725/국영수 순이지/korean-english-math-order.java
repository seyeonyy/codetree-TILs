import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int korScore = sc.nextInt();
            int engScore = sc.nextInt();
            int mathScore = sc.nextInt();
            students[i] = new Student(name, korScore, engScore, mathScore);
        }
        Arrays.sort(students);
        for(int i = 0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].korScore + " " + students[i].engScore + " " + students[i].mathScore);
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int korScore;
    int engScore;
    int mathScore;
    public Student(String name, int korScore, int engScore, int mathScore){
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    @Override
    public int compareTo(Student student) {
        if(student.korScore == this.korScore){
            if(student.engScore == this.engScore){
                return student.mathScore - this.mathScore;
            }
            return student.engScore - this.engScore;
        }
        return student.korScore - this.korScore;
    }
}