package com.apitore.banana.response.sentiment;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SentimentResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 7425800066335457244L;

  @ApiModelProperty(required=true, value="Input: text")
  private String text;
  @ApiModelProperty(required=true, value="Output: prediction")
  SentimentEntity predict;
  @ApiModelProperty(required=true, value="Output: sentiments")
  private List<SentimentEntity> sentiments;
}
