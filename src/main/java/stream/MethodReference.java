package stream;

import java.util.stream.IntStream;

public class MethodReference {

    public static void main(String[] args) {
        simplePrinter("string_to_print");
    }

    public static void simplePrinter(String stringToPrint) {
//        IntStream.range(0, 9).forEach(i -> System.out.println(stringToPrint));
        IntStream.range(0, 9).forEach(System.out::println);
    }

}
