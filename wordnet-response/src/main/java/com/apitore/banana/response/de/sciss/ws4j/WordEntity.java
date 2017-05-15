package com.apitore.banana.response.de.sciss.ws4j;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class WordEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2664466340248610367L;

  @ApiModelProperty(required=true, value="Word ID")
  private int wordid=-1;
  @ApiModelProperty(required=true, value="Language")
  private String lang="";
  @ApiModelProperty(required=true, value="Lemma")
  private String lemma="";
  @ApiModelProperty(required=false, value="Pron")
  private String pron="";
  @ApiModelProperty(required=true, value="Part-of-speech")
  private String pos="";

}
