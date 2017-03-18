package com.apitore.banana.response.org.rome;


import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SyndEntryEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 7367460948102006465L;

  @ApiModelProperty(required=false, value="Author")
  private String author="";
  @ApiModelProperty(required=true, value="Title")
  private String title="";
  @ApiModelProperty(required=true, value="Link")
  private String link="";
  @ApiModelProperty(required=false, value="Description")
  private String description="";
  @ApiModelProperty(required=true, value="Published Date")
  private Date pubDate=new Date();

}
