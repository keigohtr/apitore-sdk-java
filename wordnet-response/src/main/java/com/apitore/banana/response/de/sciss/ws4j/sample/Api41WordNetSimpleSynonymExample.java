package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.de.sciss.ws4j.LinksResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api41WordNetSimpleSynonymExample {

  static String ENDPOINT     = "https://api.apitore.com/api/41/wordnet-simple/synonym";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("word", "犬");
    String url = UrlFormatter.format(ENDPOINT, params);

    LinksResponseEntity response =
        restTemplate.getForObject(url, LinksResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getEntries());
  }

}
