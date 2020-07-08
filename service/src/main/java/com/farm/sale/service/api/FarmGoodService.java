package com.farm.sale.service.api;

import com.farm.sale.model.FarmGood;

import java.util.List;

/**
 * (FarmGood)表服务接口
 *
 * @author mazq
 * @since 2020-07-08 16:07:26
 */
public interface FarmGoodService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FarmGood queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FarmGood> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param farmGood 实例对象
     * @return 实例对象
     */
    FarmGood insert(FarmGood farmGood);

    /**
     * 修改数据
     *
     * @param farmGood 实例对象
     * @return 实例对象
     */
    FarmGood update(FarmGood farmGood);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}