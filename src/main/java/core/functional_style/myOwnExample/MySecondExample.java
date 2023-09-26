package core.functional_style.myOwnExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MySecondExample {

    private final List<List<Integer>> integers = Arrays.asList(
            Arrays.asList(1, 0, 256, - 128),
            Arrays.asList(1, 0, 512, - 5),
            Arrays.asList(1, 0, 512, - 1024));

    public static void main(String[] args) {
        MySecondExample mySecondExample = new MySecondExample();
        Integer max = mySecondExample.findMax();
        System.out.println(max);
        max = mySecondExample.findMaxNew();
        System.out.println(max);

    }

    public Integer findMin() {
        Integer[] minimum = {Integer.MAX_VALUE};
        for(List<Integer> list : integers) {
            for (Integer integer : list) {
                if (integer < minimum[0]) {
                    minimum[0] = integer;
                }
            }
        }
        return minimum[0];
    }

    public Integer findMax() {
        Integer[] maximum = {Integer.MIN_VALUE};
        for(List<Integer> list : integers) {
            for (Integer integer : list) {
                if (integer > maximum[0]) {
                    maximum[0] = integer;
                }
            }
        }
        return maximum[0];
    }

    public Integer findMaxNew() {
        Integer[] maximum = {Integer.MIN_VALUE};
        forEach(
                (i) -> {
                    if (i > maximum[0]) {
                        maximum[0] = i;
                    }
                }
        );
        return maximum[0];
    }

    private void forEach(Consumer<Integer> action) {
        for (List<Integer> list : integers) {
            for (Integer integer : list) {
                action.accept(integer);
            }
        }
    }

}
