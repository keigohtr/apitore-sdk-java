package com.apitore.banana.response.word2vec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class DistanceResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -1813141929047578472L;

  @ApiModelProperty(required=true, value="Input word")
  private String word="";
  @ApiModelProperty(required=true, value="Input num")
  private String num="";
  @ApiModelProperty(required=false, value="Distances")
  private List<DistanceEntity> distances=new ArrayList<DistanceEntity>();
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public DistanceResponseEntity() {}

}
