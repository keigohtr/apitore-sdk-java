package com.apitore.banana.response.org.rome;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SyndFeedResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 1612117803916011224L;

  @ApiModelProperty(required=true, value="Input RSS")
  private String rss="";
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
  @ApiModelProperty(required=true, value="Num")
  private int num=0;
  @ApiModelProperty(required=true, value="Entries")
  private List<SyndEntryEntity> entries=new ArrayList<>();

}
