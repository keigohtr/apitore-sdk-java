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
public class TokenResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -7248630788308853901L;

  @ApiModelProperty(required=false, value="Tokens")
  private List<TokenEntity> tokens;

}
