package open_ai;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.image.CreateImageRequest;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class AiService {

    public String generateImage(final AiRequestDTO aiRequestDTO) {
        try {
//            String token = System.getenv("OPENAI_TOKEN");
            String token = "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";
            OpenAiService openAiService = new OpenAiService(token);
            CreateImageRequest imageRequest = CreateImageRequest.builder()
                    .prompt(aiRequestDTO.getText())
                    .build();

            return openAiService.createImage(imageRequest).getData().get(0).getUrl();
        } catch(Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public List<String> generateText(final AiRequestDTO aiRequestDTO) {
        try {
            String token = "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";
            OpenAiService openAiService = new OpenAiService(token);
            CompletionRequest completionRequest = CompletionRequest.builder()
                    .model("text-davinci-003")
                    .prompt(aiRequestDTO.getText())
                    .build();

            return openAiService
                    .createCompletion(completionRequest)
                    .getChoices()
                    .stream()
                    .map(CompletionChoice::getText)
                    .collect(toList());
        } catch(Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

}
