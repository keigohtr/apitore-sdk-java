package com.apitore.banana.response.sentencepiece.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.sentencepiece.SentencePieceTokenResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api37SentencePiece4WikiExample {

  static String ENDPOINT     = "https://api.apitore.com/api/37/sentencepiece-unigram-wiki/get";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("text", "吾輩は猫である。名前はまだない。");
    String url = UrlFormatter.format(ENDPOINT, params);

    SentencePieceTokenResponseEntity response =
        restTemplate.getForObject(url, SentencePieceTokenResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getTokens().get(0).getToken());
  }

}
