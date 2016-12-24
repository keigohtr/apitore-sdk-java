package com.apitore.banana.response.summarize;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SentenceResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -3066048134288521027L;

  @ApiModelProperty(required=true, value="Input: text")
  private String text;
  @ApiModelProperty(required=true, value="Output: sentences")
  private List<String> sentences;
}
