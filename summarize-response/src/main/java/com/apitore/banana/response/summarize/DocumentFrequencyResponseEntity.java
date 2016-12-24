package com.apitore.banana.response.summarize;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class DocumentFrequencyResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 4446017232656269853L;

  @ApiModelProperty(required=true, value="Input: word")
  private String word;
  @ApiModelProperty(required=true, value="Output: document frequency")
  private Double documentFrequency=0D;
}
