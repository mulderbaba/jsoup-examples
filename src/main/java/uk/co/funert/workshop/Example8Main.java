package uk.co.funert.workshop;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mertcaliskan
 */
public class Example8Main {

    @Test
    public void simpleTextCleaningWorksOK() {
        String html = "<div><a href='http://www.oracle.com'><b>Hello Reader</b>!</a></div>";
        String cleanHtml = Jsoup.clean(html, Whitelist.simpleText());
        assertThat(cleanHtml, is("<b>Hello Reader</b>!"));
    }

    @Test
    public void basicCleaningWorksOK() {
        String html = "<div><p><a href='javascript:hackSystem()'>Hello</a></div>";
        String cleanHtml = Jsoup.clean(html, Whitelist.basic());
        assertThat(cleanHtml, is("<p><a rel=\"nofollow\">Hello</a></p>"));
    }
}
