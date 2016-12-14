package com.apitore.banana.response.org.jsoup;


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
public class LinkResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = -989258726170309864L;

  @ApiModelProperty(required=true, value="Links")
  private List<String> links=new ArrayList<>();

}
