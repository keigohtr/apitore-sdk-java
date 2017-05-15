package com.apitore.banana.response.de.sciss.ws4j;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SynlinkEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 595198829392526991L;

  @ApiModelProperty(required=true, value="Synset1")
  private String synset1="";
  @ApiModelProperty(required=true, value="Synset2")
  private String synset2="";
  @ApiModelProperty(required=true, value="Link")
  private String link="";
  @ApiModelProperty(required=true, value="Src")
  private String src="";

}
