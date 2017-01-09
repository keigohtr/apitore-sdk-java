package com.apitore.banana.response.twitter.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.twitter.TwitterSummarizeResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api27TwitterSummarizeExample {

  static String ENDPOINT     = "https://api.apitore.com/api/27/twitter-summarize/get";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("q", "Apitore");
    params.put("iter", "1");
    params.put("num", "3");
    String url = UrlFormatter.format(ENDPOINT, params);

    TwitterSummarizeResponseEntity response =
        restTemplate.getForObject(url, TwitterSummarizeResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getTweets().get(0).getText());
    System.out.println(response.getTweets().get(0).getScore());
  }

}
