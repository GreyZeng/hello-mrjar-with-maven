package git.snippet;

public class App {
    public static void main(String[] args) {
        System.out.println(String.format("Running on %s", new DefaultVersion().version()));
    }
}
