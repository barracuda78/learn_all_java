package open_ai;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.image.CreateImageRequest;
import com.theokanning.openai.service.OpenAiService;
import lombok.Value;

import java.util.List;
import java.util.Properties;

import static java.util.stream.Collectors.toList;

public class AiService {


    private PropertiesLoader propertiesLoader = new PropertiesLoader();

    public String generateImage(final AiRequestDTO aiRequestDTO) {
        try {
            Properties tokenProperties = propertiesLoader.loadProperties("C:\\epam\\projects\\learn\\src\\main\\resources\\openai.properties");
//            String token = System.getenv("OPENAI_TOKEN");
            String token = tokenProperties.getProperty("openAiToken");
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
            Properties tokenProperties = propertiesLoader.loadProperties("C:\\epam\\projects\\learn\\src\\main\\resources\\openai.properties");
            String token = tokenProperties.getProperty("openAiToken");
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
