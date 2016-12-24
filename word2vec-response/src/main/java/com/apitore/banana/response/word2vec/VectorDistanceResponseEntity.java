package com.apitore.banana.response.word2vec;

import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class VectorDistanceResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -770501944201896300L;

  @ApiModelProperty(required=true, value="Input vector")
  private double[] input;
  @ApiModelProperty(required=true, value="Input num")
  private String num;
  @ApiModelProperty(required=false, value="Distances")
  private List<DistanceEntity> distances;

}
