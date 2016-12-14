package com.apitore.banana.response.org.jsoup;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class TextResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 5066032034986918495L;

  @ApiModelProperty(required=true, value="Text")
  private String text="";

}
