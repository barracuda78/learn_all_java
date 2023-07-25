package security;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Base64 {

    public static void main(String[] args) {
        java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();

        java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();

        String header = "{\"alg\": \"HS265\"}";
        String body = "{\"username\": \"danielle\"}";

        byte[] headerEncodedByteArray = encoder.encode(header.getBytes(StandardCharsets.UTF_8));

        byte[] bodyEncodedByteArray = encoder.encode(body.getBytes(StandardCharsets.UTF_8));

        String h = Arrays.toString(headerEncodedByteArray);

        String b = Arrays.toString(bodyEncodedByteArray);

        System.out.println(h);
        System.out.println(b);

        System.out.println("------------------------------------");

        char[] h_chars = new char[128];
        System.out.println("header:");
        for(int i = 0; i < headerEncodedByteArray.length; i++) {
            byte b1 = headerEncodedByteArray[i];
            char c = (char) b1;
            h_chars[i] = c;
            System.out.print(c);
        }
        System.out.println();
        System.out.println("body:");
        char[] b_chars = new char[128];

        for(int i = 0; i < bodyEncodedByteArray.length; i++) {
            byte b1 = bodyEncodedByteArray[i];
            char c = (char) b1;
            b_chars[i] = c;
            System.out.print(c);
        }
        System.out.println();


    }

}
