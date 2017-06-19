package com.apitore.banana.response.clustering;


import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class ClusterEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -1087763534089757583L;

  @ApiModelProperty(required=true, value="center")
  private double[] center;
  @ApiModelProperty(required=true, value="words")
  private List<String> words;

}
