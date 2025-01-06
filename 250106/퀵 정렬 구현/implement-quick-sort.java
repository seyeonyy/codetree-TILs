import java.util.Scanner;
public class Main {
    public static final int MAX_INT = 100000+1;
    public static int[] arr = new int[MAX_INT];
    public static int n;
    public static int pivot;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition(int[] arr, int low, int high){
        pivot = selectPivot(arr, low, high);
        swap(arr, high, getPivotIndex(arr, low, high, pivot));
        int i = low -1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i += 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static int getPivotIndex(int[] arr, int low, int high, int pivot){
        int pv = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == pivot){
                pv = i;
            }
        }
        return pv;
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static int selectPivot(int[] arr, int low, int high){
        int mid = (low + high) / 2;
        int a = arr[low];
        int b = arr[mid];
        int c = arr[high];
        if((a >= b && b >= c) || (c >= b && b >= a)){
            pivot = b;
        }else if((a >= c && c >= b) || (b >=c && c >= a)){
            pivot = c;
        }else{
            pivot = a;
        }
        return pivot;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pos = partition(arr, low, high);
            quickSort(arr, low, pos-1);
            quickSort(arr, pos+1, high);
        }
    }
}