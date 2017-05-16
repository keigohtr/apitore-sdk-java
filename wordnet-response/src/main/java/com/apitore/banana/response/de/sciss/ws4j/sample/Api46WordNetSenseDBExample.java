package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.de.sciss.ws4j.SenseResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 *
 * 日本語WordNetのすべてにアクセスできます。
 */
public class Api46WordNetSenseDBExample {

  static String ENDPOINT1    = "https://api.apitore.com/api/46/wordnet/sense/bywordid";
  static String ENDPOINT2    = "https://api.apitore.com/api/46/wordnet/sense/bysynset";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate1 = new RestTemplate();
    Map<String, String> params1 = new HashMap<String, String>();
    params1.put("access_token", ACCESS_TOKEN);
    params1.put("wordid", "185856");
    String url1 = UrlFormatter.format(ENDPOINT1, params1);

    SenseResponseEntity response1 =
        restTemplate1.getForObject(url1, SenseResponseEntity.class, params1);


    System.out.println(response1.getLog());
    System.out.println(response1.getEntries());

    RestTemplate restTemplate2 = new RestTemplate();
    Map<String, String> params2 = new HashMap<String, String>();
    params2.put("access_token", ACCESS_TOKEN);
    params2.put("synset", "10641755-n");
    String url2 = UrlFormatter.format(ENDPOINT2, params2);

    SenseResponseEntity response2 =
        restTemplate2.getForObject(url2, SenseResponseEntity.class, params2);

    System.out.println(response2.getLog());
    System.out.println(response2.getEntries());
  }

}
