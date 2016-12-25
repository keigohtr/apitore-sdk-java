package com.apitore.banana.response.summarize.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.summarize.SentenceResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api17SentenceSeparatorExample {

  static String ENDPOINT     = "https://api.apitore.com/api/17/sentence-separate/heuristics";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("text", "吾輩は猫である。名前はまだない。");
    String url = UrlFormatter.format(ENDPOINT, params);

    SentenceResponseEntity response =
        restTemplate.getForObject(url, SentenceResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getSentences().get(0));
  }

}
