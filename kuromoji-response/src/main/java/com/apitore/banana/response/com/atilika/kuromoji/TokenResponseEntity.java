package com.apitore.banana.response.com.atilika.kuromoji;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class TokenResponseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2306724100334453642L;

  @ApiModelProperty(required=false, value="Tokens")
  private List<TokenEntity> tokens=new ArrayList<TokenEntity>();
  @ApiModelProperty(required=true, value="Log message")
  private String log="";
  @ApiModelProperty(required=true, value="Start date")
  private String startTime="";
  @ApiModelProperty(required=true, value="End date")
  private String endTime="";
  @ApiModelProperty(required=true, value="Process time [millisecond]")
  private String processTime="";

}
