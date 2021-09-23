import java.net.MalformedURLException;
import java.net.URL;

public class MalUrl {

    public static void main(String[] args) {


        URL url = null;

        try {
            url = new URL("https://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("URL protocol " + url.getProtocol());

    }
}
