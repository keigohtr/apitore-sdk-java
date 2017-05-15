package com.apitore.banana.response.de.sciss.ws4j;


import java.util.ArrayList;
import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class SynlinkResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -8361802875405029621L;

  @ApiModelProperty(required=true, value="Entries")
  private List<SynlinkEntity> entries=new ArrayList<>();

}
