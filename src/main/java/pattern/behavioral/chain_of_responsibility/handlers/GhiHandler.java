package pattern.behavioral.chain_of_responsibility.handlers;

import pattern.behavioral.chain_of_responsibility.Alphabet;

public class GhiHandler implements Processable {
    @Override
    public boolean canProcess(Alphabet alphabet) {
        return Alphabet.GHI == alphabet;
    }

    @Override
    public String process(Alphabet alphabet) {
        return "ghi";
    }

}
