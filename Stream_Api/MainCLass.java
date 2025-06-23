package Stream_Api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCLass {

    public static void main(String[] args) {


        //lambda expressions
        Walkable obj = ( steps,  isEnabled)->{
            System.out.println("walking fast " + steps + " steps");
            return 2*steps;
        };

        obj.walk(20 , true);


        List<String> fruits = List.of("apple" , "banana" , "kiwi");

        List<Integer> length = fruits.stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());

        System.out.println(length);
//        Stream<String> stream = fruits.stream();

//        stream.forEach((fruit)->{
//            System.out.println(fruit);
//        });

//        stream.filter( fruit -> fruit.length() < 5)
//                .sorted()
//                .map(fruit -> fruit.length())
//                .forEach(fruit -> System.out.println(fruit));







    }
}

interface  Walkable{
    int walk(int steps , boolean isEnabled);
}
