package com.apitore.banana.response.word2vec;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class WordVectorResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 3050057956052841035L;

  @ApiModelProperty(required=true, value="Input word")
  private String word="";
  @ApiModelProperty(required=false, value="Vector")
  private double[] vector=new double[0];

}
