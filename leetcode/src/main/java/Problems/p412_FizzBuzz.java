package Problems;

import java.util.ArrayList;
import java.util.List;

public class p412_FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isDivisibleBy3 = (i + 1) % 3 == 0;
            boolean isDivisibleBy5 = (i + 1) % 5 == 0;
            resultList.add(isDivisibleBy3 ? isDivisibleBy5 ? "FizzBuzz" : "Fizz" : isDivisibleBy5 ? "Buzz" : String.valueOf(i + 1));
        }
        return resultList;
    }


//      Solution 1
//    public static List<String> fizzBuzz(int n) {
//        List<String> resultList = new ArrayList<>();
//
//        for (int i = 0; i < n;i++) {
//            boolean isDivisibleBy3 = (i+1) % 3 ==0 ;
//            boolean isDivisibleBy5 = (i+1) % 5 ==0 ;
//
//            if (isDivisibleBy3 && isDivisibleBy5) {
//                resultList.add("FizzBuzz");
//                continue;
//            }
//
//            if (isDivisibleBy3) {
//                resultList.add("Fizz");
//                continue;
//            }
//
//            if (isDivisibleBy5) {
//                resultList.add("Buzz");
//                continue;
//            }
//
//            resultList.add(String.valueOf(i+1));
//        }
//
//        return resultList;
//    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
