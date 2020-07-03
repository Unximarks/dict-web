package com.farm.sale.service.api.impl;

import com.farm.sale.dao.api.AgencyDao;
import com.farm.sale.service.api.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService {
    @Autowired
    private AgencyDao agencyDao;

    @Override
    public List<String> selectAgence() {
        return agencyDao.selectId();
    }
}
