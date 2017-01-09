package com.apitore.banana.response.twitter;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class TwitterResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -3693557052282385634L;

  @ApiModelProperty(required=true, value="Input: query")
  private String query;
  @ApiModelProperty(required=true, value="Output: Numof tweets")
  private int numofTweets;
  @ApiModelProperty(required=true, value="Output: Tweets")
  private List<TweetEntity> tweets;
}
