import java.util.Scanner;
import java.util.Arrays;
class Person{
    String name;
    String addr;
    String city;
    Person(String name){
        this.name = name;
    }
    Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        String[] peopleName = new String[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            people[i] = new Person(name, addr, city);
            peopleName[i] = name;
        }
        Arrays.sort(peopleName);
        for(int i = 0; i < n; i++){
            if(peopleName[n-1].equals(people[i].name)){
                System.out.println("name " + people[i].name);
                System.out.println("addr " + people[i].addr);
                System.out.println("city " + people[i].city);
            }
        }
    }
}