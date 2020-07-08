package com.farm.sale.service.api.impl;

import com.farm.sale.dao.api.FarmGoodDao;
import com.farm.sale.model.FarmGood;
import com.farm.sale.service.api.FarmGoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FarmGood)表服务实现类
 *
 * @author mazq
 * @since 2020-07-08 16:08:39
 */
@Service("farmGoodService")
public class FarmGoodServiceImpl implements FarmGoodService {
    @Resource
    private FarmGoodDao farmGoodDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FarmGood queryById(Integer id) {
        return this.farmGoodDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FarmGood> queryAllByLimit(int offset, int limit) {
        return this.farmGoodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param farmGood 实例对象
     * @return 实例对象
     */
    @Override
    public FarmGood insert(FarmGood farmGood) {
        this.farmGoodDao.insert(farmGood);
        return farmGood;
    }

    /**
     * 修改数据
     *
     * @param farmGood 实例对象
     * @return 实例对象
     */
    @Override
    public FarmGood update(FarmGood farmGood) {
        this.farmGoodDao.update(farmGood);
        return this.queryById(farmGood.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.farmGoodDao.deleteById(id) > 0;
    }
}