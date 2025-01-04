import java.util.Scanner;
public class Main {
    public static final int MAX_NUM = 100000;
    public static int[] arr = new int[MAX_NUM];
    public static int n;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high){
        int[] mergedArr = new int[n];
        int i = low;
        int j = mid+1;
        int k = low;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                mergedArr[k] = arr[i];
                k += 1;
                i += 1;
            }else{
                mergedArr[k] = arr[j];
                k += 1;
                j += 1;
            }
        }
        while(i <= mid){
            mergedArr[k] = arr[i];
            k += 1; i += 1;
        }
        while(j <= high){
            mergedArr[k] = arr[j];
            k += 1; j += 1;
        }
        for(int l = low; l <= high; l++){
            arr[l] = mergedArr[l];
        }
    }
}