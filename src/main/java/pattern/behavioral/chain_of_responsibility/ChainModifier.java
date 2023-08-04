package pattern.behavioral.chain_of_responsibility;

import pattern.behavioral.chain_of_responsibility.handlers.AbcHandler;
import pattern.behavioral.chain_of_responsibility.handlers.DefHandler;
import pattern.behavioral.chain_of_responsibility.handlers.GhiHandler;
import pattern.behavioral.chain_of_responsibility.handlers.Processable;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ChainModifier implements Modifiable {

    private final List<Processable> handlers = List.of(new AbcHandler(), new DefHandler(), new GhiHandler());


    @Override
    public String modify(Alphabet alphabet) {
        AtomicReference<String> result = new AtomicReference<>();
        handlers.forEach(handler -> {
            if(handler.canProcess(alphabet)) {
                result.accumulateAndGet(handler.process(alphabet), (string1, string2) -> string1);
            }
        });
        return result.get();
    }

}
