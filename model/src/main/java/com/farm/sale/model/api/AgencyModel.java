package com.farm.sale.model.api;

import lombok.Data;

import java.util.Date;

/**
 * 代理人Model
 * Created by mazq on 2020-04-22
 */
// "新房代理人")
@Data
public class AgencyModel {
	// "新盘id")
	private String mobileGardenId;

	//"代理人id")
	private String personId;

	//"排序")
	private Long sort;

	// "创建时间")
	private Date createTime;

	private String headUrl;

	private String id;


}
