package com.farm.sale.dao.api;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 代理人Dao层
 * Created by mazq on 2020-04-22
 */
@Mapper
public interface AgencyDao {
	List<String> selectId();
}
