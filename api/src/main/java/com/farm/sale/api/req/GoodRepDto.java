package com.farm.sale.api.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GoodRepDto {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("简介")
    private String introduce;
}
