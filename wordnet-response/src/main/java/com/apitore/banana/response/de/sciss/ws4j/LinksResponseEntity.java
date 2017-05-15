package com.apitore.banana.response.de.sciss.ws4j;


import java.util.ArrayList;
import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class LinksResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -2982202860771009522L;

  @ApiModelProperty(required=true, value="Input word")
  private String word="";
  @ApiModelProperty(required=true, value="Entries")
  private List<LinkWordsEntity> entries=new ArrayList<>();

}
