package com.farm.sale.api.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShowcaseDto {

    @ApiModelProperty(value = "楼盘名称")
    private String gardenName;

    @ApiModelProperty(value = "图片信息")
    private List<String> imageInfos = new ArrayList<>();

    @ApiModelProperty(value = "房源编码")
    private String houseNumber;

    @ApiModelProperty(value = "售价")
    private Double salePrice;

    @ApiModelProperty(value = "售单价")
    private Double saleUnitPrice;

    @ApiModelProperty(value = "租价")
    private Double rentPrice;

    @ApiModelProperty(value = "租单价")
    private Double rentUnitPrice;

    @ApiModelProperty(value = "房间数")
    private Integer bedRoom;

    @ApiModelProperty(value = "厅数")
    private Integer livingRoom;

    @ApiModelProperty(value = "卫生间数")
    private Integer bathRoom;

    @ApiModelProperty(value = "建筑面积")
    private Double buildingArea;

    @ApiModelProperty(value = "亮点")
    private String lightSpot;

    @ApiModelProperty(value = "店铺电话")
    private String storePhone;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "监制机关")
    private String supervise;

    @ApiModelProperty(value = "企业投诉电话")
    private String complaintPhone;
}
