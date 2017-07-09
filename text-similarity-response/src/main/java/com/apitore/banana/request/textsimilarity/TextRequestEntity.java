package com.apitore.banana.request.textsimilarity;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class TextRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 8129054384108864481L;

  @ApiModelProperty(required=true, value="text1")
  String text1;
  @ApiModelProperty(required=true, value="text2")
  String text2;

}
