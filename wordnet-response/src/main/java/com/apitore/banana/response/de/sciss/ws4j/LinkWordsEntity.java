package com.apitore.banana.response.de.sciss.ws4j;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class LinkWordsEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 4948257202776057494L;

  @ApiModelProperty(required=true, value="Link label En")
  private String labelen="";
  @ApiModelProperty(required=true, value="Link label Ja")
  private String labelja="";
  @ApiModelProperty(required=true, value="Input part-of-speech")
  private String pos="";
  @ApiModelProperty(required=true, value="Link words")
  private Set<String> words=new HashSet<String>();

}
