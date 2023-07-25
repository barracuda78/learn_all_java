package pattern.structural.proxy;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class ProxyClass implements OriginalClass {

    private final String name;

    private OriginalClass originalClass;

    public ProxyClass(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String voice() {
        if (originalClass == null) {
            originalClass = new OriginalClassImpl("Some name");
        }
        String voice = originalClass.voice();
        return "=====" + voice + "=====";
    }

}
