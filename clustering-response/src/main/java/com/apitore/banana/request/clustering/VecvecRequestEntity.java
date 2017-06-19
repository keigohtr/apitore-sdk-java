package com.apitore.banana.request.clustering;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class VecvecRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -9107786130526792159L;

  @ApiModelProperty(required=true, value="Vector1")
  double[] vec1;
  @ApiModelProperty(required=true, value="Vector2")
  double[] vec2;

}
