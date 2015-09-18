package uk.co.funert.workshop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by mertcaliskan
 */
public class Example2Main {

    public static void main(String... args) throws IOException {
        Document document = Jsoup.connect("https://java.net/website/java-champions/bios.html").timeout(0).get();
        Elements allElements = document.getElementsByTag("a");
        for (Element element : allElements) {
            if ("New!".equals(element.nextElementSibling() != null ? element.nextElementSibling().ownText() : "")) {
                System.out.println(element.ownText());
            }
        }
    }
}
