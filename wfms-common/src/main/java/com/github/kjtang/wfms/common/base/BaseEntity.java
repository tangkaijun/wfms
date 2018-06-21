package com.github.kjtang.wfms.common.base;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by kaijun on 2018/6/21.
 * 顶级基类
 */
@Data
public class BaseEntity implements Serializable {

    private Long id;

}
