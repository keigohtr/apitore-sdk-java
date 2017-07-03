package com.apitore.banana.response.com.atilika.kuromoji;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class TokensResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 2333665773431074230L;

  @ApiModelProperty(required=false, value="Tokens")
  private List<List<TokenEntity>> tokens;

}
