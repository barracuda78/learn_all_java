package pattern.structural.proxy;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        final OriginalClass originalClass = new ProxyClass("Andrei");
        final String name = originalClass.getName();
        long afterGetName = System.currentTimeMillis();
        originalClass.voice();
        long end = System.currentTimeMillis();


        System.out.println("afterGetName - start: " + (afterGetName - start));
        System.out.println("end - afterGetName:   " + (end - afterGetName));
        System.out.println("end - start:          " + (end - start));

    }

}
