package pattern.behavioral.chain_of_responsibility;

import static pattern.behavioral.chain_of_responsibility.Alphabet.*;

public class Main {

    private final Modifiable swithcModifiable = new SwithCaseModifier();
    private final Modifiable chainModifiable = new SwithCaseModifier();

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.swithcModifiable.modify(DEF));
        System.out.println("====================");
        System.out.println(main.chainModifiable.modify(GHI));
    }

}
