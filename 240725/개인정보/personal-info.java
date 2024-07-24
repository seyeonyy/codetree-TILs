import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }
        Arrays.sort(people);
        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.printf("%.1f", people[i].weight);
            System.out.println();
        }
        System.out.println();
        Arrays.sort(people, new Comparator<Person>(){
            @Override
			public int compare(Person o1, Person o2) {
				return o2.height - o1.height;
			}
        });
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.printf("%.1f", people[i].weight);
            System.out.println();
        }
    }

}
class Person implements Comparable<Person>{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
}