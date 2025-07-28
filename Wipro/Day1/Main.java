package Wipro.Day1;

public class Main {
    public static void convertFun(String s){

        System.out.println("int value :" + Integer.parseInt(s));
        System.out.println("long value :" + Long.parseLong(s));
        System.out.println("double value :" + Double.parseDouble(s));
        System.out.println("float value :" + Float.parseFloat(s));
        System.out.println("Short value :" + Short.parseShort(s));
        System.out.println("Byte value :" + Byte.parseByte(s));

        System.out.println(Integer.compare(10 ,303));
        System.out.println(Integer.compare(10,10));
        System.out.println(Integer.compare(20 ,10));

    }
    public static void main(String[] args) {
        Double db1 = new Double(10.787);
        Double db2 = new Double(20.577);

        System.out.println(db1+db2);

        convertFun("123");


    }

}
