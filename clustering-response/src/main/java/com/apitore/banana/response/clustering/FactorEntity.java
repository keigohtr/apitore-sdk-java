package com.apitore.banana.response.clustering;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class FactorEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -6749668334427456019L;

  @ApiModelProperty(required=true, value="word")
  private String word;
  @ApiModelProperty(required=true, value="similarity")
  private double similarity;

}
