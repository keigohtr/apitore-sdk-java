package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.de.sciss.ws4j.common.PosDef;
import com.apitore.banana.response.de.sciss.ws4j.SynsetResponseEntity ;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 *
 * 日本語WordNetのすべてにアクセスできます。
 */
public class Api46WordNetSynsetDBExample {

  static String ENDPOINT1    = "https://api.apitore.com/api/46/wordnet/synset/bysynset";
  static String ENDPOINT2    = "https://api.apitore.com/api/46/wordnet/synset/byname";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate1 = new RestTemplate();
    Map<String, String> params1 = new HashMap<String, String>();
    params1.put("access_token", ACCESS_TOKEN);
    params1.put("synset", "10641755-n");
    String url1 = UrlFormatter.format(ENDPOINT1, params1);

    SynsetResponseEntity  response1 =
        restTemplate1.getForObject(url1, SynsetResponseEntity .class, params1);


    System.out.println(response1.getLog());
    System.out.println(response1.getEntries());

    RestTemplate restTemplate2 = new RestTemplate();
    Map<String, String> params2 = new HashMap<String, String>();
    params2.put("access_token", ACCESS_TOKEN);
    params2.put("name", "spy");
    params2.put("pos", PosDef.n.toString());
    String url2 = UrlFormatter.format(ENDPOINT2, params2);

    SynsetResponseEntity  response2 =
        restTemplate2.getForObject(url2, SynsetResponseEntity .class, params2);

    System.out.println(response2.getLog());
    System.out.println(response2.getEntries());
  }

}
