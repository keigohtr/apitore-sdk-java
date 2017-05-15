package com.apitore.banana.response.de.sciss.ws4j;


import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SynsetDefResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 6760513202637637912L;

  @ApiModelProperty(required=true, value="Synset")
  private String synset="";
  @ApiModelProperty(required=true, value="Language")
  private String lang="";
  @ApiModelProperty(required=true, value="Definition")
  private String def="";
  @ApiModelProperty(required=true, value="sid")
  private int sid=-1;

}
