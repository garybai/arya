package com.javabgy.aryaucenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @author Gary
 * @className UserPO
 * @description TODO
 * @date 2019/11/24 18:10
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("t_user")
public class UserPO extends BasePO {
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
    private String nickname;
    private Date birthday;
    private String phone;
    private Boolean isEnabled;
}
