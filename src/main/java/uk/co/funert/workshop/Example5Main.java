package uk.co.funert.workshop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.io.IOException;

/**
 * Created by mertcaliskan
 */
public class Example5Main {

    static String htmlText = "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "<title>Java Magazine</title>" +
            "</head>" +
            "<body>" +
            "<h1>Hello World!</h1>" +
            "</body>" +
            "</html>";

    public static void main(String... args) throws IOException {
        Document document = Jsoup.parse(htmlText);

        document.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                System.out.println("Node start: " + node.nodeName());
            }
            public void tail(Node node, int depth) {
                System.out.println("Node end: " + node.nodeName());
            }
        });
    }
}