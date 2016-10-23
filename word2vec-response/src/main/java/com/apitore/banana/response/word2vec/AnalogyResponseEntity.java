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
public class AnalogyResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -5982168352521919855L;

  @ApiModelProperty(required=true, value="Input positives")
  private String positives;
  @ApiModelProperty(required=true, value="Input negatives")
  private String negatives;
  @ApiModelProperty(required=true, value="Input num")
  private String num;
  @ApiModelProperty(required=false, value="Analogies")
  private List<String> analogies;

}
