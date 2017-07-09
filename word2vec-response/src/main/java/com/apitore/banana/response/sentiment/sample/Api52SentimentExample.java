package com.apitore.banana.response.sentiment.sample;


import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.apitore.banana.request.sentiment.SentimentRequestEntity;
import com.apitore.banana.response.sentiment.ListSentimentResponseEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Keigo Hattori
 */
public class Api52SentimentExample {

  static String ENDPOINT     = "https://api.apitore.com/api/52/sentiments/predict";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    String url = String.format("%s?access_token=%s", ENDPOINT, ACCESS_TOKEN);
    ObjectMapper mapper = new ObjectMapper();
    SentimentRequestEntity req = new SentimentRequestEntity();
    req.setTexts(Arrays.asList("明日は良い天気。","今日はたくさん寝た。","昨日は雨だった。"));
    String json = mapper.writeValueAsString(req);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(json, headers);

    ResponseEntity<ListSentimentResponseEntity> response = restTemplate
        .exchange(url, HttpMethod.POST, entity, ListSentimentResponseEntity.class);
    ListSentimentResponseEntity res = response.getBody();

    System.out.println(res.getLog());
    System.out.println(res.getSentimentlist().get(0).getPredict().getSentiment());
    System.out.println(res.getSentimentlist().get(0).getPredict().getScore());
    System.out.println();
  }

}
