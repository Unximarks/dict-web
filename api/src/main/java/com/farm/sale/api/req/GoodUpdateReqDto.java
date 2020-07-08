package com.farm.sale.api.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GoodUpdateReqDto {
    @ApiModelProperty("修改的id")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("简介")
    private String introduce;
}

