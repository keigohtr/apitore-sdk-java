package com.apitore.banana.response.sentiment;


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
  private static final long serialVersionUID = 5871728960857397682L;

  @ApiModelProperty(required=true, value="Input text")
  private String text="";
  @ApiModelProperty(required=true, value="Output sentiment")
  private String sentiment="";

}
