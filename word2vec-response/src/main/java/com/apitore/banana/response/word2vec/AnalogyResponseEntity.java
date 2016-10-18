package com.apitore.banana.response.word2vec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class AnalogyResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -1813141929047578472L;

  @ApiModelProperty(required=true, value="Input positives")
  private String positives="";
  @ApiModelProperty(required=true, value="Input negatives")
  private String negatives="";
  @ApiModelProperty(required=true, value="Input num")
  private String num="";
  @ApiModelProperty(required=false, value="Analogies")
  private List<String> analogies=new ArrayList<String>();
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";


  /* Constructor */
  public AnalogyResponseEntity() {}

}
