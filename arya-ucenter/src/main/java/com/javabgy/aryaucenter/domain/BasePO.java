package com.javabgy.aryaucenter.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Gary
 * @className BasePO
 * @description TODO
 * @date 2019/11/24 18:07
 **/
@Data
public class BasePO implements Serializable {
    private Long id;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
