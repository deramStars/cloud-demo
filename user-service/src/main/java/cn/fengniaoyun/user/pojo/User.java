package cn.fengniaoyun.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 11:29 2019/6/3
 * @Modified By: LiangZF
 */
@Data
@Table(name = "tb_user")
public class User {
    // 主键id,自增
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    // 用户名
    private String userName;
    // 密码
    private String password;
    // 姓名
    private String name;
    // 年龄
    private Integer age;
    // 性别 1男 2女
    private Integer sex;
    // 创建人id
    private Date created;
    // 更新时间
    private Date updated;
    // 备注 不需要持久化
    @Transient
    private String note;
}
