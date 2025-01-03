import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static int[] arr = new int[100000];
    public static int n;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        radixSort();
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void radixSort(){
        for(int pos = 0; pos < 6; pos++){
            ArrayList<Integer>[] newArr = new ArrayList[10];
            for(int i = 0; i < newArr.length; i++){
                newArr[i] = new ArrayList<>();
            }
            for(int i = 0; i < n; i++){
                int digit = (arr[i] / (int)Math.pow(10, pos)) % 10;
                newArr[digit].add(arr[i]);
            }
            int index = 0;
            int[] storeArr = new int[n];
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < newArr[i].size(); j++){
                    storeArr[index++] = newArr[i].get(j);
                }
            }
            arr = storeArr;
        }
    }
}