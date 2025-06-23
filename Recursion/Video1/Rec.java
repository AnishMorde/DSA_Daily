package Recursion.Video1;

public class Rec {
    public static void main(String[] args) {
         print(0);

    }

    public static void print(int  n){

        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);

        print(n+1);
    }

}
