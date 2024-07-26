import java.util.Scanner;
import java.util.Arrays;
class Person implements Comparable<Person>{
    String name;
    String addr;
    String city;
    public Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            people[i] = new Person(name, addr, city);
        }
        Arrays.sort(people);
        System.out.println("name " + people[n-1].name);
        System.out.println("addr " + people[n-1].addr);
        System.out.println("city " + people[n-1].city);
    }
}