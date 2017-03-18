package com.apitore.banana.response.org.rome.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.org.rome.SyndFeedResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api28Rss2JsonExample {

  static String ENDPOINT     = "https://api.apitore.com/api/28/rome/rss2json";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("rss", "http://news.yahoo.co.jp/pickup/rss.xml");
    String url = UrlFormatter.format(ENDPOINT, params);

    SyndFeedResponseEntity response =
        restTemplate.getForObject(url, SyndFeedResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getTitle());
    System.out.println(response.getDescription());
  }

}
