package com.apitore.banana.response.clustering.sample;


import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.apitore.banana.request.clustering.VecwordRequestEntity;
import com.apitore.banana.response.clustering.SimilarityResponseEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Keigo Hattori
 */
public class Api49CosineSimilarityExample2 {

  static String ENDPOINT     = "https://api.apitore.com/api/49/cosine-similarity/vec-word";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    String url = String.format("%s?access_token=%s", ENDPOINT, ACCESS_TOKEN);
    ObjectMapper mapper = new ObjectMapper();
    VecwordRequestEntity req = new VecwordRequestEntity();
    req.setVec(new double[]{1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0});
    req.setWord("犬");
    String json = mapper.writeValueAsString(req);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(json, headers);

    ResponseEntity<SimilarityResponseEntity> response = restTemplate
        .exchange(url, HttpMethod.POST, entity, SimilarityResponseEntity.class);
    SimilarityResponseEntity res = response.getBody();

    System.out.println(res.getLog());
    System.out.println(res.getScore());
    System.out.println();
  }

}
