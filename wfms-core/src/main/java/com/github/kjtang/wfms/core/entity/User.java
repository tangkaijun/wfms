package com.github.kjtang.wfms.core.entity;

import com.github.kjtang.wfms.common.base.BasePageEntity;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * Created by kaijun on 2018/6/21.
 */
@Data
public class User extends BasePageEntity {

    private String username;

    private String password;

    private Integer gender;

    private String realName;

    private String email;

    private String phone;
}
