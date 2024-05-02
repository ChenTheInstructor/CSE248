package p2_url_reader;

import java.io.*;
import java.net.*;

public class URLReader {
    public static void main(String[] args) {
        try {
//            URL url = new URL("http://example.com"); // deprecated
            URL url = URI.create("http://example.com").toURL();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
