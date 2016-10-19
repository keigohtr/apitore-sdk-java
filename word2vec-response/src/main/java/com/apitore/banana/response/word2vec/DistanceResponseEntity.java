package com.apitore.banana.response.word2vec;

import java.util.ArrayList;
import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class DistanceResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 7070503881709006405L;

  @ApiModelProperty(required=true, value="Input word")
  private String word="";
  @ApiModelProperty(required=true, value="Input num")
  private String num="";
  @ApiModelProperty(required=false, value="Distances")
  private List<DistanceEntity> distances=new ArrayList<DistanceEntity>();

}
