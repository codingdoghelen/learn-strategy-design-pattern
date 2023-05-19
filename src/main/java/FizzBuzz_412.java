import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(3)); // ["1","2","Fizz"]

        System.out.println(fizzBuzz(5)); // ["1","2","Fizz","4","Buzz"]

        System.out.println(fizzBuzz(15)); // ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

    }

    public static List<String> fizzBuzz(int n) {
        // Time complexity: O(n)
        // Space complexity: O(1) // No other data structures created
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
//            System.out.println("i: " + i);
//            System.out.println("n: " +n);
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}

