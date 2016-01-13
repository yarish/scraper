package com.shapalyst.scraper;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class App {

  public static void main(String[] args) {

    // scan from command line TODO
    String URL = "https://fr.wikipedia.org/wiki/Apache_Struts#Apache_Struts_2";

    // String URL = "http://www.google.com";
    // http://en.wikipedia.org/
    // SiteScraper parser = new SiteScraper(URL);
    // parser.parse();


    try {
      final WebClient client = new WebClient(BrowserVersion.FIREFOX_38);
      final HtmlPage htmlPage = client.getPage(URL);
      //Assert.assertEquals("HtmlUnit - Welcome to HtmlUnit", htmlPage.getTitleText());
      
    } catch (FailingHttpStatusCodeException e) {
      e.printStackTrace();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }



  }
}
