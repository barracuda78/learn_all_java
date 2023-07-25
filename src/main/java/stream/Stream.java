package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List <String> strings = List.of("123", "abc", "AAA", "bbb");

        List<String> b = strings.stream()
                .filter(s -> s.startsWith("b"))
                .collect(Collectors.toList());

        System.out.println(b);
    }

}
