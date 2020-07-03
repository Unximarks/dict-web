package com.farm.sale.model.api;

import lombok.Data;

@Data
public class Good {
    private String id;
    private String name;
    private String price;
    private String createTime;
    private String quality;
}
