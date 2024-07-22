import java.util.Scanner;
class Data{
    String date;
    String day;
    String weather;
    Data(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] data = new Data[n];
        int idx = 0;
        for(int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain")){
                idx = i;
            }
            data[i] = new Data(date, day, weather);
        }
        for(int i = n-1; i >= 0; i--){
            if(i != idx && data[i].date.compareTo(data[idx].date) < 0 && data[i].weather.equals("Rain")){
                idx = i;
            }
        }
        System.out.println(data[idx].date + " " + data[idx].day + " " + data[idx].weather);
    }
}