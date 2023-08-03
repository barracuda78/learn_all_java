package clean_code.side_effects;

import java.io.*;
import java.nio.file.Paths;
import java.util.function.Function;

public class PassingTheBlockTechnique {

    public static final String STRING_PATH =
            "C:\\epam\\projects\\learn\\src\\main\\java\\clean_code\\side_effects\\just_a_text.txt";

    public static void main(String[] args) {
        PassingTheBlockTechnique p = new PassingTheBlockTechnique();
        String result = p.processFile((function) -> new FileFromStringFunction().apply(STRING_PATH));
        System.out.println("result: " + result);
    }

    public String processFile(Action action) {

        File file = action.perform(strPth -> Paths.get(strPth).toFile());

        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

}

interface Action {

    File perform(Function<String, File> function);

}

class FileFromStringFunction implements Function<String, File> {

    @Override
    public File apply(String s) {
        return Paths.get(s).toFile();
    }

}
