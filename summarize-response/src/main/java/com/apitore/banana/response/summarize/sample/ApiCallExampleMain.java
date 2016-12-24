package com.apitore.banana.response.summarize.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.summarize.LabelResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class ApiCallExampleMain {

  static String ENDPOINT     = "https://api.apitore.com/api/18/text2label-tfidf/get";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("text", "シナモンロールがめちゃくちゃ美味しい！");
    params.put("num", "5");
    String url = UrlFormatter.format(ENDPOINT, params);

    LabelResponseEntity response =
        restTemplate.getForObject(url, LabelResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getLabels().get(0).getLabel());
    System.out.println(response.getLabels().get(0).getScore());
  }

}
