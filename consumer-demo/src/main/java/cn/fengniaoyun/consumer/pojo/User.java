package cn.fengniaoyun.consumer.pojo;

import lombok.Data;
import java.util.Date;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 11:29 2019/6/3
 * @Modified By: LiangZF
 */
@Data
public class User {

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
    private String note;
}
