import java.util.Scanner;
public class Main {
    public static int MAX_INT = 100000;
    public static int[] arr = new int[MAX_INT+1];
    public static int n;
    public static void heapSort(){
        for(int i = n/2; i >= 1; i--){
            heapify(n, i);
        }
        for(int i = n; i > 1; i--){
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            heapify(i-1, 1);
        }
    }
    public static void heapify(int n, int i){
        int largest = i;
        int l = i*2;
        int r = i*2+1;
        if(l <= n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r <= n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(n, largest);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        heapSort();
        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}