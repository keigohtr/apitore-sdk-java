package com.apitore.banana.response.twitter.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.twitter.TwitterResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api23TwitterSearchExample {

  static String ENDPOINT     = "https://api.apitore.com/api/23/twitter/search";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("q", "Apitore");
    params.put("iter", "1");
    String url = UrlFormatter.format(ENDPOINT, params);

    TwitterResponseEntity response =
        restTemplate.getForObject(url, TwitterResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getTweets().get(0).getText());
  }

}
