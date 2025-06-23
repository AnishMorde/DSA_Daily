package Recursion.Video1;

public class Fibo {
    public static void main(String[] args) {
        int ans = fiboFun(4);
        System.out.println(ans);
    }

    public static int fiboFun(int n){
        if(n< 2){
            return n;
        }

        return fiboFun(n-1) + fiboFun(n-2);
    }
}
