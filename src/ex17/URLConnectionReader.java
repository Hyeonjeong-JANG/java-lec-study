package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
    public static void main(String[] args) throws IOException {
        URL site = null;
        try {
            site = new URL("https://www.naver.com/");
            URLConnection url = site.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
            String inLine;

            while ((inLine = in.readLine()) != null) {
                System.out.println(inLine);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
