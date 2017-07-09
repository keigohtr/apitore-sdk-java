package com.apitore.banana.response.textsimilarity;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class TextSimilarityResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 8870874086273031574L;

  @ApiModelProperty(required=true, value="Text1")
  private String text1;

  @ApiModelProperty(required=true, value="Text2")
  private String text2;

  @ApiModelProperty(required=true, value="Similarity")
  private double similarity;

}
