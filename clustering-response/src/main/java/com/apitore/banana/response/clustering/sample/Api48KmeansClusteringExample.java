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

import com.apitore.banana.request.clustering.ClusteringRequestEntity;
import com.apitore.banana.response.clustering.ClusterResponseEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Keigo Hattori
 */
public class Api48KmeansClusteringExample {

  static String ENDPOINT     = "https://api.apitore.com/api/48/kmeans-wordvector/cluster";
  static String ACCESS_TOKEN = "YOUR-ACCESS-TOKEN";

  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    String url = String.format("%s?access_token=%s", ENDPOINT, ACCESS_TOKEN);
    ObjectMapper mapper = new ObjectMapper();
    ClusteringRequestEntity req = new ClusteringRequestEntity();
    req.setNum(3);
    req.setWords(new String[]{"犬","柴犬","砂糖","塩","サッカー","野球","テニス","猫","三毛猫","胡椒"});
    String json = mapper.writeValueAsString(req);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(json, headers);

    ResponseEntity<ClusterResponseEntity> response = restTemplate
        .exchange(url, HttpMethod.POST, entity, ClusterResponseEntity.class);
    ClusterResponseEntity res = response.getBody();

    System.out.println(res.getLog());
    System.out.println(res.getClusters().get(0).getCenter());
    System.out.println(res.getClusters().get(0).getWords());
    System.out.println();
  }

}
