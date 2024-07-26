import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
class Data implements Comparable<Data>{
    LocalDate date;
    String day;
    String weather;
    public Data(LocalDate date ,String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
    @Override
    public int compareTo(Data data){
        return this.date.compareTo(data.date);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] data = new Data[n];
        for(int i = 0; i < n; i++){
            LocalDate date = LocalDate.parse(sc.next());
            String day = sc.next();
            String weather = sc.next();
            data[i] = new Data(date, day, weather);
        }
        Arrays.sort(data);
        for(int i = 0; i < n; i++){
            if(data[i].weather.equals("Rain")){
                System.out.println(data[i].date + " " + data[i].day + " " + data[i].weather);
                break;
            }
        }
    }
}