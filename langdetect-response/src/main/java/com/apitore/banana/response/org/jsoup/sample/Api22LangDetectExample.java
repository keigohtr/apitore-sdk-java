package com.apitore.banana.response.org.jsoup.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.org.jsoup.LanguageResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api22LangDetectExample {

  static String ENDPOINT     = "https://api.apitore.com/api/22/langdetect/get";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("text", "吾輩は猫である。名前はまだない。");
    String url = UrlFormatter.format(ENDPOINT, params);

    LanguageResponseEntity response =
        restTemplate.getForObject(url, LanguageResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getText());
    System.out.println(response.getLanguage());
    System.out.println(response.getProbabilities().get(0).getLang());
    System.out.println(response.getProbabilities().get(0).getProb());
  }

}
