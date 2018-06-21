package com.github.kjtang.wfms.common.base;

import java.util.List;

/**
 * Created by kaijun on 2018/6/21.
 */
public interface BaseMapper<T extends BaseEntity> {

    /**
     * 插入实体
     * @param entity  实体信息
     * @return  刚插入实体的id
     */
    int insert(T entity);

    /**
     * 更新实体
     * @param entity
     */
    void update(T entity);

    /**
     * 删除实体
     * @param eneity
     */
    void delete(T eneity);

    /**
     * 通过实体信息查询单个实体
     * @param entity
     * @return
     */
    T get(T entity);

    /**
     * 通过实体信息查询
     * @param entity
     * @return
     */
    List<T> getList(T entity);

}
