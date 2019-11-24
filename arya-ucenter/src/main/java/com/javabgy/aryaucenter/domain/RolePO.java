package com.javabgy.aryaucenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author Gary
 * @className RolePO
 * @description TODO
 * @date 2019/11/24 18:15
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("t_role")
public class RolePO extends BasePO {
    private String name;
    private String description;
}
