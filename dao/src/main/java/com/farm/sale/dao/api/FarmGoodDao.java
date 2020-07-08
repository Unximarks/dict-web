package com.farm.sale.dao.api;

import com.farm.sale.model.FarmGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * (FarmGood)表数据库访问层
 *
 * @author mazq
 * @since 2020-07-08 16:07:26
 */
public interface FarmGoodDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FarmGood queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FarmGood> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param farmGood 实例对象
     * @return 对象列表
     */
    List<FarmGood> queryAll(FarmGood farmGood);

    /**
     * 新增数据
     *
     * @param farmGood 实例对象
     * @return 影响行数
     */
    int insert(FarmGood farmGood);

    /**
     * 修改数据
     *
     * @param farmGood 实例对象
     * @return 影响行数
     */
    int update(FarmGood farmGood);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}