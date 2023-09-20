import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringUtilsExample {
    public static void main(String[] args) {
        // Generating a random alphanumeric string
        String randomString = RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Random String: " + randomString);
    }
}
