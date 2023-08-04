package pattern.behavioral.chain_of_responsibility.handlers;

import pattern.behavioral.chain_of_responsibility.Alphabet;

public class DefHandler implements Processable {
    @Override
    public boolean canProcess(Alphabet alphabet) {
        return Alphabet.DEF == alphabet;
    }

    @Override
    public String process(Alphabet alphabet) {
        return "def";
    }

}
