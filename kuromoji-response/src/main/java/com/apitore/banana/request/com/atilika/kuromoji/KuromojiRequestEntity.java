package com.apitore.banana.request.com.atilika.kuromoji;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class KuromojiRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2336008124361026980L;

  @ApiModelProperty(required=true, value="texts [max 1MB]")
  List<String> texts=new ArrayList<>();

}
