package com.farm.sale.service.api.impl;


import com.farm.sale.dao.api.FarmMessageDao;
import com.farm.sale.model.FarmMessage;
import com.farm.sale.service.api.FarmMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (FarmMessage)表服务实现类
 *
 * @author mazq
 * @since 2020-07-10 16:19:21
 */
@Service("farmMessageService")
public class FarmMessageServiceImpl implements FarmMessageService {
    @Resource
    private FarmMessageDao farmMessageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FarmMessage queryById(Integer id) {
        return this.farmMessageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FarmMessage> queryAllByLimit(int offset, int limit) {
        return this.farmMessageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param farmMessage 实例对象
     * @return 实例对象
     */
    @Override
    public FarmMessage insert(FarmMessage farmMessage) {
        farmMessage.setCreateTime(new Date());
        this.farmMessageDao.insert(farmMessage);
        return farmMessage;
    }

    /**
     * 修改数据
     *
     * @param farmMessage 实例对象
     * @return 实例对象
     */
    @Override
    public FarmMessage update(FarmMessage farmMessage) {
        this.farmMessageDao.update(farmMessage);
        return this.queryById(farmMessage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.farmMessageDao.deleteById(id) > 0;
    }
}