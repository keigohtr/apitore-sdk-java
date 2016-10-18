package com.apitore.banana.response.word2vec;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class WordVectorResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2573623523783133607L;

  @ApiModelProperty(required=true, value="Input word")
  private String word="";
  @ApiModelProperty(required=false, value="Vector")
  private double[] vector=new double[0];
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public WordVectorResponseEntity() {}

}
