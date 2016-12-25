package com.apitore.banana.response.word2vec.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.word2vec.WordVectorResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api10Word2VecWordVectorExample {

  static String ENDPOINT     = "https://api.apitore.com/api/10/word2vec-neologd-jawiki/wordvector";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word", "犬");
    String url = UrlFormatter.format(ENDPOINT, params);

    WordVectorResponseEntity response =
        restTemplate.getForObject(url, WordVectorResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getVector()[0]);
  }

}
