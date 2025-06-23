package Math;

public class Prime {

    public static boolean isPrime(int n){


        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    /*

    for the 36

    1*36
    2*18
    3*12
    4*9
    6*6

    repeat this no again


     */



     static void printPrime (int n){
         for(int i=2;i<=n;i++){
             if(isPrime(i)){
                 System.out.println(i);
             }
         }
     }


    public static void main(String[] args) {

        System.out.println( Prime.isPrime(25));
       Prime.printPrime(40);




    }
}
