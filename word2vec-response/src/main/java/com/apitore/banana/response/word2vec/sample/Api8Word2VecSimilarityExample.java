package com.apitore.banana.response.word2vec.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.word2vec.SimilarityResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api8Word2VecSimilarityExample {

  static String ENDPOINT     = "https://api.apitore.com/api/8/word2vec-neologd-jawiki/similarity";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word1", "ポメラニアン");
    params.put("word2", "ゴールデンレトリバー");
    String url = UrlFormatter.format(ENDPOINT, params);

    SimilarityResponseEntity response =
        restTemplate.getForObject(url, SimilarityResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getSimilarity());
  }

}
