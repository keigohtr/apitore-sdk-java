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
public class TweetEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 9099572909075114578L;

  @ApiModelProperty(required=true, value="Status ID")
  private Long statusId;
  @ApiModelProperty(required=true, value="Tweet text")
  private String text;
  @ApiModelProperty(required=true, value="Tweet date")
  private Date createdAt;
  @ApiModelProperty(required=true, value="Tweet client")
  private String source;
  @ApiModelProperty(required=true, value="Is this favorited?")
  private boolean isFavorited;
  @ApiModelProperty(required=true, value="Number of be favorited")
  private Integer favoritedCount;
  @ApiModelProperty(required=true, value="Is this retweeted?")
  private boolean isRetweeted;
  @ApiModelProperty(required=true, value="Number of be retweeted")
  private Integer retweetCount;
  @ApiModelProperty(required=true, value="User ID")
  private Long userId;
  @ApiModelProperty(required=true, value="User name")
  private String userName;
  @ApiModelProperty(required=true, value="User screen name")
  private String userScreenName;
  @ApiModelProperty(required=true, value="User profile image URL")
  private String userProfileImageURL;

  @ApiModelProperty(required=false, value="Tweet sentiment by Apitore sentiment API")
  private String sentiment;
  @ApiModelProperty(required=false, value="Tweet sentiment score by Apitore sentiment API")
  private Double sentimentScore;

}
