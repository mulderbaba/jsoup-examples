package uk.co.funert.workshop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by mertcaliskan
 */
public class Example4Main {

    public static void main(String... args) throws IOException {
        Document document = Jsoup.connect("https://java.net/website/java-champions/bios.html").timeout(0).get();
        Elements allElements = document.select("a[href*=#] ~ font:containsOwn(New!)");
        for (Element element : allElements) {
            System.out.println(element.previousElementSibling().ownText());
        }
    }
}
