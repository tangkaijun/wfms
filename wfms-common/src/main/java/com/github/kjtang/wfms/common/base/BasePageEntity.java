package com.github.kjtang.wfms.common.base;

import lombok.Data;

/**
 * Created by kaijun on 2018/6/21.
 * 顶级分页基类
 */
@Data
public class BasePageEntity extends BaseEntity {

    private Integer curPage;

    private Integer pageSize;

    /**
     * 如果页面没有传递分页数据,则调用该方法默认初始化
     */
    public void defaultInitPageInfo(){
        this.curPage = 1;
        this.pageSize = 10;
    }

}
