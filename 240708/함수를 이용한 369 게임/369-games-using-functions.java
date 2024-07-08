import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 10;
        int share = 0;
        int remain = 0;
        int cnt = 0;
        int s = 0;
        int r = 0;
        for(int i = a; i <= b; i++){
            share = i / num;
            remain = i % num;
            if(i <= 100){
                if(isShareNumber(share) || isRemainNumber(remain) || i % 3 == 0){
                    cnt++;
                }
            }else if(i <= 1000){
                if(isRemainNumber(remain) || i % 3 == 0){
                    cnt++;
                }else{
                    s = share / num;
                    r = share % num;
                    if(isShareNumber(s) || isRemainNumber(r)){
                        cnt++;
                    }
                }
            }else if(i <= 10000){
                if(isRemainNumber(remain) || i % 3 == 0){
                    cnt++;
                }else{
                    r = share % num;
                    s = share / num;
                    if(isRemainNumber(r)){
                        cnt++;
                    }else{
                        share = s / num;
                        remain = s % num;
                        if(isShareNumber(share) || isRemainNumber(remain)){
                            cnt++;
                        }
                    }
                }
            }else if(i <= 100000){
                if(isRemainNumber(remain) || i % 3 == 0){
                    cnt++;
                }else{
                    s = share / num;
                    r = share % num;
                    if(isShareNumber(r)){
                        cnt++;
                    }else{
                        share = s / num;
                        remain = s % num;
                        if(isRemainNumber(remain)){
                            cnt++;
                        }else{
                            s = share / num;
                            r = share % num;
                            if(isRemainNumber(r) || isShareNumber(s)){
                                cnt++;
                            }
                        }
                    }
                }
            }else{
                if(isRemainNumber(remain) || i % 3 == 0){
                    cnt++;
                }else{
                    s = share / num;
                    r = share % num;
                    if(isRemainNumber(r)){
                        cnt++;
                    }else{
                        share = s / num;
                        remain = s % num;
                        if(isRemainNumber(remain)){
                            cnt++;
                        }else{
                            s = share / num;
                            r = share % num;
                            if(isRemainNumber(r)){
                                cnt++;
                            }else{
                                share = s / num;
                                remain = s % num;
                                if(isRemainNumber(remain) || isShareNumber(share)){
                                    cnt++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    public static boolean isShareNumber(int n){
        return n == 3 || n == 6 || n == 9;
    }
    public static boolean isRemainNumber(int n){
        return n == 3 || n == 6 || n == 9;
    }
}