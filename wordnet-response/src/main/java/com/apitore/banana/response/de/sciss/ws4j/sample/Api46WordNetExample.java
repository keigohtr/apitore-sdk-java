package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.de.sciss.ws4j.WordResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 *
 * 日本語WordNetのすべてにアクセスできます。
 */
public class Api46WordNetExample {

  static String ENDPOINT     = "https://api.apitore.com/api/46/wordnet/word/bylemma";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("lemma", "犬");
    params.put("pos", "n");
    String url = UrlFormatter.format(ENDPOINT, params);

    WordResponseEntity response =
        restTemplate.getForObject(url, WordResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getEntries());
  }

}
