package git.snippet;

public class DefaultVersion {

    public String version() {
        System.out.println("use jdk 9+");
        return Runtime.version().toString();
    }
}

