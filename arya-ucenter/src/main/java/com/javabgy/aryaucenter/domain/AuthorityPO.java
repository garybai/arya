package com.javabgy.aryaucenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author Gary
 * @className AuthorityPO
 * @description TODO
 * @date 2019/11/24 18:18
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("t_authority")
public class AuthorityPO extends BasePO {
    private String name;
    private String resource;
    private String description;
    private Integer orderNum;
}
