// print all the outcomes who doesnopt have consecutive heads

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int n = sc.nextInt();
      
        int ans = tossWithoutConsecutiveHead(n, "");
        System.out.println(ans);
    }
    
    public static int tossWithoutConsecutiveHead(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }
        int a = 0;
        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){  
 // we can check it for T as well (ans.length() == 0 || ans.charAt(ans.length() - 1) == ’T’) then both call will work otherwise only T call will work
            a = tossWithoutConsecutiveHead(n - 1, ans + "H");
        }
        int b = tossWithoutConsecutiveHead(n - 1, ans + "T");
        return a + b;
    }
}