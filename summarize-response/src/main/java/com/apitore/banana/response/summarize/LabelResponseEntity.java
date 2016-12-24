package com.apitore.banana.response.summarize;

import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class LabelResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -2477423610645950392L;

  @ApiModelProperty(required=true, value="Input word")
  private String input;
  @ApiModelProperty(required=true, value="Input num")
  private String num;
  @ApiModelProperty(required=false, value="Distances")
  private List<LabelEntity> labels;

}
