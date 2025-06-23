package Recursion.String;

import java.util.ArrayList;

public class subSequence {

    public static void main(String[] args) {
       ArrayList<String>  list = fun("" , "abc"  , new ArrayList<String>());
        System.out.println(list);

    }

    public static ArrayList<String> fun(String ans , String str , ArrayList<String> list){
        if(str.isEmpty()){
          list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
         fun(ans+ch , str.substring(1 ) , list) ;
        return  fun(ans , str.substring(1 ) , list);

    }

    public static ArrayList<String> funWithBody(String ans , String str , ArrayList<String> list){
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        fun(ans+ch , str.substring(1 ) , list) ;
        return  fun(ans , str.substring(1 ) , list);

    }
}
