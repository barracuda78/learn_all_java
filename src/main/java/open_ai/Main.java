package open_ai;

import java.util.List;

public class Main {

    AiService aiService = new AiService();

    public static void main(String[] args) {
        Main main = new Main();
        //for the picture:
//        AiRequestDTO aiRequestDTO = new AiRequestDTO("Dancing Donald Duck");
//        String s = main.aiService.generateImage(aiRequestDTO);
//        System.out.println(s);

//        String text = "Create an SQL request to find all employees who are older than 40 years old.";
        String text = "Please give a one word answer. Please infer if the person saying text sample delimited by triple backticks is positive or negative. '''I am completely upset!'''";
        AiRequestDTO aiRequestDTO = new AiRequestDTO(text);
        List<String> strings = main.aiService.generateText(aiRequestDTO);
        System.out.println(strings);

    }
}
