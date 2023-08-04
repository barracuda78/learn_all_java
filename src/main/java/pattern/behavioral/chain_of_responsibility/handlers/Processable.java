package pattern.behavioral.chain_of_responsibility.handlers;

import pattern.behavioral.chain_of_responsibility.Alphabet;

public interface Processable {

    boolean canProcess(Alphabet alphabet);

    String process(Alphabet alphabet);

}
