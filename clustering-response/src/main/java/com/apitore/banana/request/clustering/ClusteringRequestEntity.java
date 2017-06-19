package com.apitore.banana.request.clustering;


import java.io.Serializable;
import java.util.Set;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class ClusteringRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -7318458366273599201L;

  @ApiModelProperty(required=true, value="words [max 1000 words]")
  Set<String> words;
  @ApiModelProperty(required=false, value = "num [max 100, default 10]")
  int num=10;

}
