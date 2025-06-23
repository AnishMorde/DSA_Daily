package Recursion.String;

public class PhonePad {
    public static void main(String[] args) {
          fun("" ,"7");
    }


    public static void fun(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit-2)*3 ;i<(digit-1)*3;i++){
            char ch = (char)('a'+i);
            fun(p+ch , up.substring(1));

        }
    }
}
