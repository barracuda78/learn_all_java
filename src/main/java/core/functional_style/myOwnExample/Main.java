package core.functional_style.myOwnExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> integers = Arrays.asList(1, 10, 8, 4, 7, 128);
        System.out.println(main.findLowest(integers));
        System.out.println(main.findBiggest(integers));
    }

    public Integer findLowest(List<Integer> integers) {
        final Integer[] lowest = {Integer.MAX_VALUE};
        forEach((i) -> {
            if (integers.get(i) < lowest[0]) {
                lowest[0] = integers.get(i);
            }
        }, integers.size());
        return lowest[0];
    }

    public Integer findBiggest(List<Integer> integers) {
        final Integer[] biggest = {Integer.MIN_VALUE};
        forEach((i) -> {
            if (integers.get(i) > biggest[0]) {
                biggest[0] = integers.get(i);
            }
        }, integers.size());
        return biggest[0];
    }

    private void forEach(Consumer<Integer> action, int size) {
        for(int i = 0; i < size; i++) {
            action.accept(i);
        }
    }

}
