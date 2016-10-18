package com.apitore.banana.response.word2vec;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class DistanceEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -7464128958519398356L;

  @ApiModelProperty(required=true, value="word")
  private String word;
  @ApiModelProperty(required=true, value="cosine distance")
  private double distance;


  /* Constructor */
  public DistanceEntity(String word, double distance) {
    this.word     = word;
    this.distance = distance;
  }

}
