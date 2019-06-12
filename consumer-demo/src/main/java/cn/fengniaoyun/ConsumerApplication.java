package cn.fengniaoyun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 16:35 2019/6/4
 * @Modified By: LiangZF
 */

@EnableFeignClients
@SpringCloudApplication
public class ConsumerApplication {

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
