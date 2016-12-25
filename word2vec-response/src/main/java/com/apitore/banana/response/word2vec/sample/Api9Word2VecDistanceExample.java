package com.apitore.banana.response.word2vec.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.word2vec.DistanceResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api9Word2VecDistanceExample {

  static String ENDPOINT     = "https://api.apitore.com/api/9/word2vec-neologd-jawiki/distance";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word", "犬");
    params.put("num", "5");
    String url = UrlFormatter.format(ENDPOINT, params);

    DistanceResponseEntity response =
        restTemplate.getForObject(url, DistanceResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getDistances().get(0).getWord());
    System.out.println(response.getDistances().get(0).getDistance());
  }

}
