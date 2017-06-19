package com.apitore.banana.response.clustering;

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
  private static final long serialVersionUID = 4013846503995589485L;

  @ApiModelProperty(required=true, value="Score")
  private double score;

}
