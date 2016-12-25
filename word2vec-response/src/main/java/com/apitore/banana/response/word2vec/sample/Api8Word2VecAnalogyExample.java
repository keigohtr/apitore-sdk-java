package com.apitore.banana.response.word2vec.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.word2vec.AnalogyResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api8Word2VecAnalogyExample {

  static String ENDPOINT     = "https://api.apitore.com/api/8/word2vec-neologd-jawiki/analogy";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("positives", "日本 フランス");
    params.put("negatives", "パリ");
    params.put("num", "5");
    String url = UrlFormatter.format(ENDPOINT, params);

    AnalogyResponseEntity response =
        restTemplate.getForObject(url, AnalogyResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getAnalogies().get(0));
  }

}
