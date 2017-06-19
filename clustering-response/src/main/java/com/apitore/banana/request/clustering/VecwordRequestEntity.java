package com.apitore.banana.request.clustering;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class VecwordRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -8963573484802554042L;

  @ApiModelProperty(required=true, value="Vector")
  double[] vec;
  @ApiModelProperty(required=true, value="Word")
  String word;

}
