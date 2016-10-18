package com.apitore.banana.response.sentiment;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class SentimentResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -1189157947073009928L;

  @ApiModelProperty(required=true, value="Input text")
  private String text="";
  @ApiModelProperty(required=true, value="Output sentiment")
  private String sentiment="";
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public SentimentResponseEntity() {}

}
