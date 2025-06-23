package Recursion.String;

public class Stream {

    public static void main(String[] args) {
        fun("" , "bcsdbjanaajsnakans");

        System.out.println(funReturn("" , "aasdsdsaadas"));
        System.out.println(SkipAppNotApple("aasdappsffssdss"));

    }


    //pass the ans in the arguments and print the ans
    public static void fun(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            fun(ans , str.substring(1));
        }else{
            fun(ans+ch , str.substring(1) );
        }
    }


    public static String funReturn(String ans , String str){
        if(str.isEmpty()){

            return ans;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
           return funReturn(ans , str.substring(1));
        }else{
           return funReturn(ans+ch , str.substring(1) );
        }
    }

    public static String SkipAppNotApple(String str){
        if(str.isEmpty()){

            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return SkipAppNotApple(str.substring(3));
        }else{
            return str.charAt(0)+SkipAppNotApple( str.substring(1) );
        }
    }


    public static String fun3(String str){
        if(str.isEmpty()){

            return "";
        }
        if(str.startsWith("apple")){
            return fun3(str.substring(5));
        }else{
            return str.charAt(0)+fun3( str.substring(1) );
        }
    }





}
