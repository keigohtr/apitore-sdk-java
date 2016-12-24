package com.apitore.banana.response.summarize;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class LabelEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 3360849869408090670L;

  @ApiModelProperty(required=true, value="label")
  private String label;
  @ApiModelProperty(required=true, value="tfidf score")
  private Double score;

}
