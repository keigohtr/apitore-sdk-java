package com.apitore.banana.response.org.jsoup;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class LanguageEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -5040120680857043534L;

  @ApiModelProperty(required=true, value="language")
  private String lang;
  @ApiModelProperty(required=true, value="probability")
  private Double prob;

}
