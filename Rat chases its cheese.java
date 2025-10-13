// ques link: https://codeskiller.codingblocks.com/problems/535


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c]; 

        for(int i = 0; i < r; i++){
            arr[i] = sc.next().toCharArray();
        }
        int [][] ans = new int[r][c];

        helper(arr, ans, 0, 0);
        if(!pathCheck){
            System.out.print("NO PATH FOUND");
        }
    }
    static boolean pathCheck = false;
    public static void helper(char[][] arr, int[][] ans, int r, int c){
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] == 'X' || ans[r][c] == 1 ){
            return;
        }
        if(r == arr.length - 1 && c == arr[0].length - 1){
            ans[r][c] = 1;
            for(int[] ar : ans){
                for(int i : ar){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            pathCheck = true;
            return;
        }
        ans[r][c] = 1;
        helper(arr, ans, r - 1, c); //top
        helper(arr, ans, r, c - 1); //left
        helper(arr, ans, r + 1, c); //down
        helper(arr, ans, r, c + 1); //right
        ans[r][c] = 0;
    }
}
