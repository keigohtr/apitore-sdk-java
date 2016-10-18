package com.apitore.banana.response.word2vec;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class SimilarityResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -354535791899200309L;

  @ApiModelProperty(required=true, value="Input word1")
  private String word1="";
  @ApiModelProperty(required=true, value="Input word2")
  private String word2="";
  @ApiModelProperty(required=false, value="Similarity")
  private double similarity=0;
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public SimilarityResponseEntity() {}

}
