package com.apitore.banana.response.sentiment;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class ListSentimentResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 4782884067832448078L;

  @ApiModelProperty(required=true, value="Output: sentiment list")
  private List<SentimentResponseEntity> sentimentlist;
}
