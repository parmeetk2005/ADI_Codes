// COUNT all the outcomes of the coin toss

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int n = sc.nextInt();

        int ans = tossCount(n, "");
        System.out.println(ans);
    }
    public static int tossCount(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }
        int a = tossCount(n - 1, ans + "H");
        int b = tossCount(n - 1, ans + "T");
        return a + b;
    }
}