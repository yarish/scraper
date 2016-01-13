package com.shapalyst.scraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteScraper {

  private String URL;

  SiteScraper(String URL) {
    this.URL = URL;
  }

  public void parse() {
    try {
      Document document = Jsoup.connect(URL).get();
      // System.out.println(document.toString());

      Elements urls = document.select("#p-lang div.body ul li a");

      for (Element url : urls) {
//        System.out.println("url=" + url.attr("href"));
        System.out.println("language=" + url.text());
      }
      // Elements newHeadLines = document.select("#mp-itn b a");
      // for (Element element : newHeadLines) {
      // System.out.println(element.text());
      // }

    } catch (IOException e) {
      System.out.println("Exception" + e.getStackTrace());
    }

  }
}
