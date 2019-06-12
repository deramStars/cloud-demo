package cn.fengniaoyun.consumer.client;

import cn.fengniaoyun.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 15:14 2019/6/11
 * @Modified By: LiangZF
 */
@FeignClient(value = "user-service",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Long id);
}
