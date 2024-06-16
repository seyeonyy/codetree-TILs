public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] arr = new int[5][5];
        
        for(int j = 0; j < 5; j++){
            arr[0][j] = 1;
            arr[j][0] = 1;
        }

        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1]; 
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}