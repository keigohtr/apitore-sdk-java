package com.apitore.banana.request.word2vec;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class WordsRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -661023155731655485L;

  @ApiModelProperty(required=true, value="words [max 1MB]")
  Set<String> words=new HashSet<>();

}
