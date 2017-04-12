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
public class FeedResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -346346930446402179L;

  @ApiModelProperty(required=true, value="Input page num")
  private int page=1;
  @ApiModelProperty(required=true, value="Last Updated At")
  private Date lastUpdatedAt=new Date();
  @ApiModelProperty(required=true, value="Num")
  private int num=0;
  @ApiModelProperty(required=true, value="Entries")
  private List<FeedEntryEntity> entries=new ArrayList<>();

}
