package uk.co.funert.workshop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.Iterator;

/**
 * Created by mertcaliskan
 */
public class Example6Main {

    static String xml = "<?xml version=\"1.0\"" +
            "encoding=\"UTF8\"><entries><entry><key>xxx</key>" +
            "<value>yyy</value></entry><entry><key>xxx</key>" +
            "<value>zzz</value></entry></entries></xml>";

    public static void main(String... args) {
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        System.out.println(doc.toString());
    }
}
