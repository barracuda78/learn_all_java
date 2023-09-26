package debugging;

public class Main {

    private final String token;

    public Main(String token) {
        this.token = token;
    }

    public static void main(String[] args) {
        Main main = new Main("barracuda");
        System.out.println(main.drawBorders(main.token));
    }

    private String drawBorders(String token) {
        return "==========\n" + token + "\n==========";
    }

}
