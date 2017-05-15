package com.apitore.banana.response.de.sciss.ws4j;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SynsetEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -4624641660853842151L;

  @ApiModelProperty(required=true, value="Synset")
  private String synset="";
  @ApiModelProperty(required=true, value="Part-of-speech")
  private String pos="";
  @ApiModelProperty(required=true, value="Name")
  private String name="";
  @ApiModelProperty(required=true, value="Src")
  private String src="";

}
