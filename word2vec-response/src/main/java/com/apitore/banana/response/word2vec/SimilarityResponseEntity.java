package com.apitore.banana.response.word2vec;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SimilarityResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 3444717406990077594L;

  @ApiModelProperty(required=true, value="Input word1")
  private String word1;
  @ApiModelProperty(required=true, value="Input word2")
  private String word2;
  @ApiModelProperty(required=false, value="Similarity")
  private double similarity;

}
