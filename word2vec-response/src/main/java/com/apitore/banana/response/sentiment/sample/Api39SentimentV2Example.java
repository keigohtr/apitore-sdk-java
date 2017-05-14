package com.apitore.banana.response.sentiment.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.sentiment.SentimentResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api39SentimentV2Example {

  static String ENDPOINT     = "https://api.apitore.com/api/39/sentiment-v2/predict";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("text", "今日は晴れで気持ちがいい。");
    String url = UrlFormatter.format(ENDPOINT, params);

    SentimentResponseEntity response =
        restTemplate.getForObject(url, SentimentResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getPredict().getSentiment());
    System.out.println(response.getPredict().getScore());
  }

}
