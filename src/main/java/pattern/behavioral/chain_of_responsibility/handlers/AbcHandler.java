package pattern.behavioral.chain_of_responsibility.handlers;

import pattern.behavioral.chain_of_responsibility.Alphabet;

public class AbcHandler implements Processable {
    @Override
    public boolean canProcess(Alphabet alphabet) {
        return Alphabet.ABC == alphabet;
    }

    @Override
    public String process(Alphabet alphabet) {
        return "abc";
    }

}
