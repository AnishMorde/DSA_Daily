package Recursion.String;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println(fun("" , 4));
    }

    public static int fun(String p , int target){
        if(target==0){
            System.out.println(p);
            return 1;
        }

        int count =0;

        for(int i=1;i<=6&&i<=target;i++){
         count+=fun(p+i , target-i);
        }

        return count;
    }
}
