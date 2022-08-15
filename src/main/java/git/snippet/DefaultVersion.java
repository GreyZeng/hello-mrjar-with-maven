package git.snippet;

public class DefaultVersion {

    public String version() {
        System.out.println("use jdk");
        return System.getProperty("java.version");
    }
}
