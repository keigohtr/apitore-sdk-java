package com.apitore.banana.response.org.jsoup;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class LanguageResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -7426600629483313486L;

  @ApiModelProperty(required=true, value="Input: text")
  private String text;
  @ApiModelProperty(required=true, value="Output: prediction")
  String language;
  @ApiModelProperty(required=true, value="Output: probabilities")
  List<LanguageEntity> probabilities;

}
