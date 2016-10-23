package com.apitore.banana.response.sentiment;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class SentimentEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -1405634522194957674L;

  @ApiModelProperty(required=true, value="sentiment")
  private String sentiment;
  @ApiModelProperty(required=true, value="cosine distance")
  private Double score;

}
