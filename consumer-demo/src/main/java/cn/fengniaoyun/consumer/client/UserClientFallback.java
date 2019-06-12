package cn.fengniaoyun.consumer.client;

import cn.fengniaoyun.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 16:27 2019/6/11
 * @Modified By: LiangZF
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setName("未知用户!");
        return user;
    }
}
