package pattern.creational.builder;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .id(13L)
                .name("Barracuda")
                .build();

        System.out.println(user);
    }

}
