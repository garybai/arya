package com.javabgy.aryaucenter.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 实现createTime和updateTime自动填充
 * @author Gary
 * @className CustomMetaObjectHandler
 * @description
 * @date 2019/11/24 21:34
 **/
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Object createTime = getFieldValByName("createTime", metaObject);
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (createTime == null) {
            this.setFieldValByName("createTime", new Date(), metaObject);
        }
        if (updateTime == null) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (updateTime == null) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
    }
}
