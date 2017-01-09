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
public class TwitterSummarizeResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 5082676593796964954L;

  @ApiModelProperty(required=true, value="Input: query")
  private String query;
  @ApiModelProperty(required=true, value="Output: Numof hit tweets")
  private int numofTweets;
  @ApiModelProperty(required=true, value="Output: Numof summarize")
  private int numofSummarize;
  @ApiModelProperty(required=true, value="Output: Summarization tweets")
  private List<TweetSummarizeEntity> tweets;
}
