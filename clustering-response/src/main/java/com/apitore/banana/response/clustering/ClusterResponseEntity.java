package com.apitore.banana.response.clustering;

import java.util.List;

import com.apitore.banana.response.BaseResponseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel
@Data
@EqualsAndHashCode(callSuper=false)
public class ClusterResponseEntity extends BaseResponseEntity {

  /**
   *
   */
  private static final long serialVersionUID = 4951213644742255250L;

  @ApiModelProperty(required=true, value="Cluster num")
  private String num;
  @ApiModelProperty(required=false, value="Clusters")
  private List<ClusterEntity> clusters;

}
