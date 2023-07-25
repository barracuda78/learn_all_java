package pattern.structural.proxy;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class OriginalClassImpl implements OriginalClass {

    private final String name;

    public OriginalClassImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String voice() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "I'm saying smthng...";
    }

}
