package com.apitore.banana.response.org.rome.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.org.rome.FeedResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api33FeedsGameExample {

  static String ENDPOINT     = "https://api.apitore.com/api/33/feeds/game";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("page", "1");
    String url = UrlFormatter.format(ENDPOINT, params);

    FeedResponseEntity response =
        restTemplate.getForObject(url, FeedResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getLastUpdatedAt());
    System.out.println(response.getEntries().get(0).getTitle());
    System.out.println(response.getEntries().get(0).getLink());
  }

}
