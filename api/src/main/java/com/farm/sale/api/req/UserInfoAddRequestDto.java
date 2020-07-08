package com.farm.sale.api.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInfoAddRequestDto {
    @ApiModelProperty("farm 的id值")
    private String id;
}
