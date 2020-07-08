package com.farm.sale.api.req;

import lombok.Data;

@Data
public class PageReqDto {
    private Integer pageNum;
    private Integer pageSize;
}
