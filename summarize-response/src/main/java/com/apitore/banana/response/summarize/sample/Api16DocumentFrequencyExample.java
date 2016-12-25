package com.apitore.banana.response.summarize.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.summarize.DocumentFrequencyResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api16DocumentFrequencyExample {

  static String ENDPOINT     = "https://api.apitore.com/api/16/documentfrequency/get";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word", "犬");
    String url = UrlFormatter.format(ENDPOINT, params);

    DocumentFrequencyResponseEntity response =
        restTemplate.getForObject(url, DocumentFrequencyResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getDocumentFrequency());
  }

}
