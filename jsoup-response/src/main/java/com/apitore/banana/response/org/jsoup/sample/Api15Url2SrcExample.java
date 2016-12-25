package com.apitore.banana.response.org.jsoup.sample;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.apitore.banana.response.org.jsoup.LinkResponseEntity;
import com.apitore.banana.utils.UrlFormatter;


/**
 * @author Keigo Hattori
 */
public class Api15Url2SrcExample {

  static String ENDPOINT     = "https://api.apitore.com/api/15/jsoup/url2src";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> params = new HashMap<String, String>();
    params.put("access_token", ACCESS_TOKEN);
    params.put("url", "https://apitore.com/");
    String url = UrlFormatter.format(ENDPOINT, params);

    LinkResponseEntity response =
        restTemplate.getForObject(url, LinkResponseEntity.class, params);

    System.out.println(response.getLog());
    System.out.println(response.getLinks().get(0));
  }

}
