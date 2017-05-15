package com.apitore.banana.response.de.sciss.ws4j;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class WordnetSimilarityResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 4749138420625233969L;

  @ApiModelProperty(required=true, value="Word1")
  private String word1="";
  @ApiModelProperty(required=false, value="Pos1")
  private String pos1="";
  @ApiModelProperty(required=true, value="Word2")
  private String word2="";
  @ApiModelProperty(required=false, value="Pos2")
  private String pos2="";
  @ApiModelProperty(required=true, value="Method")
  private String method="";
  @ApiModelProperty(required=true, value="Similarity")
  private double similarity=-1;

}
