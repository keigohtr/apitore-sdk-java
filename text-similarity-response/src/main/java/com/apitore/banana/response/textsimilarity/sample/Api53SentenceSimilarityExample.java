package com.apitore.banana.response.textsimilarity.sample;


import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.apitore.banana.request.textsimilarity.TextRequestEntity;
import com.apitore.banana.response.textsimilarity.TextSimilarityResponseEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Keigo Hattori
 */
public class Api53SentenceSimilarityExample {

  static String ENDPOINT     = "https://api.apitore.com/api/53/sentence-similarity/eval";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    String url = String.format("%s?access_token=%s", ENDPOINT, ACCESS_TOKEN);
    ObjectMapper mapper = new ObjectMapper();
    TextRequestEntity req = new TextRequestEntity();
    req.setText1("私は犬と公園に行く");
    req.setText1("私は柴犬と公園に行く");
    String json = mapper.writeValueAsString(req);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(json, headers);

    ResponseEntity<TextSimilarityResponseEntity> response = restTemplate
        .exchange(url, HttpMethod.POST, entity, TextSimilarityResponseEntity.class);
    TextSimilarityResponseEntity res = response.getBody();

    System.out.println(res.getLog());
    System.out.println(res.getSimilarity());
    System.out.println();
  }

}
