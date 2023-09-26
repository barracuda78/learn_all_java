package core.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);

        Integer one = map.entrySet().stream().findFirst().get().getKey();
        System.out.println(one);

    }
}
