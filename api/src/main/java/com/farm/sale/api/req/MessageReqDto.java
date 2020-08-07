package com.farm.sale.api.req;

import lombok.Data;

@Data
public class MessageReqDto {
    private Integer id;
    private String  name ;
    private String  phone ;
    private String  email ;
    private String  message;
}
