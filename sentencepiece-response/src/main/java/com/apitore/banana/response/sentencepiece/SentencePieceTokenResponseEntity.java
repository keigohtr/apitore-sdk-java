package com.apitore.banana.response.sentencepiece;


import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SentencePieceTokenResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -9006780123661458011L;

  @ApiModelProperty(required=false, value="SentencePiece Tokens")
  private List<SPTokenEntity> tokens;

}
