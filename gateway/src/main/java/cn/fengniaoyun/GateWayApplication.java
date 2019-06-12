package cn.fengniaoyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 17:07 2019/6/11
 * @Modified By: LiangZF
 */
@EnableZuulProxy
@SpringBootApplication
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }



}
