package com.apitore.banana.response.com.atilika.kuromoji;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class TokenEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -8792363984285432559L;

  @ApiModelProperty(required=true, value="Surface")
  private String surface;
  @ApiModelProperty(required=true, value="Position")
  private Integer position;
  @ApiModelProperty(required=true, value="Part of speech level1")
  private String partOfSpeechLevel1;
  @ApiModelProperty(required=true, value="Part of speech level2")
  private String partOfSpeechLevel2;
  @ApiModelProperty(required=true, value="Part of speech level3")
  private String partOfSpeechLevel3;
  @ApiModelProperty(required=true, value="Part of speech level4")
  private String partOfSpeechLevel4;
  @ApiModelProperty(required=true, value="Conjugation type")
  private String conjugationType;
  @ApiModelProperty(required=true, value="Conjugation form")
  private String conjugationForm;
  @ApiModelProperty(required=true, value="Reading")
  private String reading;
  @ApiModelProperty(required=true, value="Base form")
  private String baseForm;
  @ApiModelProperty(required=true, value="Pronunciation")
  private String pronunciation;
  @ApiModelProperty(required=true, value="All features array")
  private String[] allFeaturesArray;
  @ApiModelProperty(required=true, value="Known")
  private Boolean known;
  @ApiModelProperty(required=true, value="All features")
  private String allFeatures;

}
