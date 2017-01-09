package com.apitore.banana.response.twitter;


import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * TwitterのレスポンスのSwagger対応
 * TODO: 完全ではない
 *
 * @author keigo hattori
 */
@ApiModel
@Data
public class TweetSummarizeEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2003468159291447047L;

  @ApiModelProperty(required=true, value="Status ID")
  private Long statusId;
  @ApiModelProperty(required=true, value="Tweet text")
  private String text;
  @ApiModelProperty(required=true, value="Tweet date")
  private Date createdAt;
  @ApiModelProperty(required=true, value="User ID")
  private Long userId;
  @ApiModelProperty(required=true, value="User name")
  private String userName;
  @ApiModelProperty(required=true, value="User screen name")
  private String userScreenName;
  @ApiModelProperty(required=true, value="User profile image URL")
  private String userProfileImageURL;

  @ApiModelProperty(required=true, value="Summarization score")
  private Double score;

  //@ApiModelProperty(required=false, value="Tweet sentiment by Apitore sentiment API")
  //private String sentiment;
  //@ApiModelProperty(required=false, value="Tweet sentiment score by Apitore sentiment API")
  //private Double sentimentScore;

}
