package com.apitore.banana.response.de.sciss.ws4j;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SenseEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1124282779664819557L;

  @ApiModelProperty(required=true, value="Synset")
  private String synset="";
  @ApiModelProperty(required=true, value="Word ID")
  private int wordid=-1;
  @ApiModelProperty(required=true, value="Language")
  private String lang="";
  @ApiModelProperty(required=true, value="Rank")
  private int rank=-1;
  @ApiModelProperty(required=true, value="Lexicon ID")
  private int lexid=-1;
  @ApiModelProperty(required=true, value="Freq")
  private int freq=-1;
  @ApiModelProperty(required=true, value="Src")
  private String src="";

}
