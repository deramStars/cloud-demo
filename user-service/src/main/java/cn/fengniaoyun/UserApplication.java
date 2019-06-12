package cn.fengniaoyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 16:12 2019/6/4
 * @Modified By: LiangZF
 */
// 多个兼容,通用性广
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.fengniaoyun.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
