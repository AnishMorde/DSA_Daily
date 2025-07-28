package Interview_pre.String;

public class StringConcepts {
    public static void main(String[] args) {
        String str1 = "anish";
        String str2 =  "anish";

        String strNew1 = new String("Anish");
        String strNew2 = new String("Anish");

        System.out.println(str1==str2); //true it == it checks the reference equality
        System.out.println(strNew1==strNew2); //false
        System.out.println(strNew1.equals(strNew2)); //true and it checks the content equality
    }
}
