package com.apitore.banana.response.de.sciss.ws4j.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.de.sciss.ws4j.common.LangDef;
import com.apitore.banana.response.de.sciss.ws4j.SynsetDefResponseEntity ;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 *
 * 日本語WordNetのすべてにアクセスできます。
 */
public class Api46WordNetSynsetDefDBExample {

  static String ENDPOINT1    = "https://api.apitore.com/api/46/wordnet/synsetdef/bysynset";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate1 = new RestTemplate();
    Map<String, String> params1 = new HashMap<String, String>();
    params1.put("access_token", ACCESS_TOKEN);
    params1.put("synset", "10641755-n");
    params1.put("lang", LangDef.jpn.toString());
    String url1 = UrlFormatter.format(ENDPOINT1, params1);

    SynsetDefResponseEntity  response1 =
        restTemplate1.getForObject(url1, SynsetDefResponseEntity .class, params1);


    System.out.println(response1.getLog());
    System.out.println(response1.getDef());
  }

}
