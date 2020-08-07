package com.farm.sale.service.api;


import com.farm.sale.model.FarmMessage;

import java.util.List;

/**
 * (FarmMessage)表服务接口
 *
 * @author mazq
 * @since 2020-07-10 16:19:18
 */
public interface FarmMessageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FarmMessage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FarmMessage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param farmMessage 实例对象
     * @return 实例对象
     */
    FarmMessage insert(FarmMessage farmMessage);

    /**
     * 修改数据
     *
     * @param farmMessage 实例对象
     * @return 实例对象
     */
    FarmMessage update(FarmMessage farmMessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}