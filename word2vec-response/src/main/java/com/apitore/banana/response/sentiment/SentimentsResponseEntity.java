package com.apitore.banana.response.sentiment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class SentimentsResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 221933561219267877L;

  @ApiModelProperty(required=true, value="Input text")
  private String text="";
  @ApiModelProperty(required=true, value="Output sentiments")
  private List<String> sentiments=new ArrayList<>();
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public SentimentsResponseEntity() {}

}
