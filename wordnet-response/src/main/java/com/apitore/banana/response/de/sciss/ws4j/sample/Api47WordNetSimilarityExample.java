package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.de.sciss.ws4j.WordnetSimilarityResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 *
 * 単語の意味的な類似度を評価します。
 * 評価手法は8種類あります。
 * hirststonge, leacockchodorow, lesk, lin, path, resnik, wupalmer
 */
public class Api47WordNetSimilarityExample {

  static String ENDPOINT     = "https://api.apitore.com/api/47/wordnet-similarity/hirststonge";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word1", "犬");
    params.put("pos1", "n");
    params.put("word2", "猟犬");
    params.put("pos2", "n");
    String url = UrlFormatter.format(ENDPOINT, params);

    WordnetSimilarityResponseEntity response =
        restTemplate.getForObject(url, WordnetSimilarityResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getWord1());
    System.out.println(response.getWord2());
    System.out.println(response.getSimilarity());
  }

}
