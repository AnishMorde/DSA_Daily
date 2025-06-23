package Recursion.Video2;

public class Rec1 {


    //no rpinting in the forward and reverse order
    public static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);

        fun(n-1);

        System.out.println(n);


    }


    //factorial of the number
    public static int fact(int n){

        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    //sum of the digits
    public static int SumDigits(int n ){
        if(n<=0){
            return 0;
        }


      return n%10 + SumDigits( n/10 );
    }

    int sum=0;

    public int revNum(int n , int rev){
        if(n==0){
            return rev;
        }
        return   revNum(n/10 ,10*rev + n%10 );
    }


    public int CountZeros(int n , int count){
        if(n==0){
            return count;
        }

        if(n%10==0){
            return CountZeros(n/10 , ++count);
        }


            return CountZeros(n/10 , count);





    }


    //main programme
    public static void main(String[] args) {
//            Rec1.fun(5);
//
//        System.out.println(Rec1.fact(5));
//
//        System.out.println(SumDigits(1199999900));

        Rec1 obj = new Rec1();

        System.out.println(  obj.CountZeros(20304 , 0));

        System.out.println(obj.revNum(1432 ,0));
    }
}
