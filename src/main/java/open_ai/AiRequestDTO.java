package open_ai;

import lombok.Data;

public class AiRequestDTO {

    private final String text;

    public AiRequestDTO(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

}
