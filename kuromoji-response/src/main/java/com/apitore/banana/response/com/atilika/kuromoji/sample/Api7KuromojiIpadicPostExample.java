package com.apitore.banana.response.com.atilika.kuromoji.sample;


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

import com.apitore.banana.request.com.atilika.kuromoji.KuromojiRequestEntity;
import com.apitore.banana.response.com.atilika.kuromoji.TokensResponseEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Keigo Hattori
 */
public class Api7KuromojiIpadicPostExample {

  static String ENDPOINT     = "https://api.apitore.com/api/7/kuromoji-ipadic/tokenize";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    String url = String.format("%s?access_token=%s", ENDPOINT, ACCESS_TOKEN);
    ObjectMapper mapper = new ObjectMapper();
    KuromojiRequestEntity req = new KuromojiRequestEntity();
    req.setTexts(Arrays.asList("吾輩は猫である。名前はまだない。"));
    String json = mapper.writeValueAsString(req);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(json, headers);

    ResponseEntity<TokensResponseEntity> response = restTemplate
        .exchange(url, HttpMethod.POST, entity, TokensResponseEntity.class);
    TokensResponseEntity res = response.getBody();

    System.out.println(res.getLog());
    System.out.println(res.getTokens().size());
    System.out.println(res.getTokens().get(0).get(0).getSurface());
    System.out.println(res.getTokens().get(0).get(0).getAllFeatures());
  }

}
