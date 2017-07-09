package com.apitore.banana.request.sentiment;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel
@Data
public class SentimentRequestEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -765216882722112691L;

  @ApiModelProperty(required=true, value="texts [max 1MB]")
  List<String> texts=new ArrayList<>();

}
