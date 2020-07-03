package com.farm.sale.dao.api;


import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 代理人Dao层
 * Created by mazq on 2020-04-22
 */
@Repository
public interface AgencyDao {
	List<String> selectId();
}
