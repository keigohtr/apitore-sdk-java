package com.apitore.banana.response.sentencepiece;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 *
 * @author keigo hattori
 */
@ApiModel
@Data
public class SPTokenEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 4278477016325597119L;

  @ApiModelProperty(required=true, value="Word ID")
  private Long wid;
  @ApiModelProperty(required=true, value="Token")
  private String token;

}
