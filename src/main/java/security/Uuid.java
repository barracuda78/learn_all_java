package security;

import java.util.UUID;

public class Uuid {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();

        String string = uuid.toString();

        System.out.println("uuid = " + string);

    }
}
