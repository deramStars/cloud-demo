package cn.fengniaoyun.consumer.web;

import cn.fengniaoyun.consumer.client.UserClient;
import cn.fengniaoyun.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangZF
 * @Description: 消费者
 * @Date: Created in 16:39 2019/6/4
 * @Modified By: LiangZF
 */
@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "queryByIdFallBack" )
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private UserClient userClient;

//    @Autowired
//    private RibbonLoadBalancerClient client;

    /*  
     * @Description http微服务之间的调用
     * @Author LiangZF
     * @param id
     * @Date 2019/6/4 16:59
     * @return cn.fengniaoyun.consumer.pojo.User
     */
//    @GetMapping("/{id}")
//    public User queryById(@PathVariable("id") Long id){
//        // 根据服务id获取实例
//        //List<ServiceInstance> instances = discoveryClient.getInstances("USER-SERVICE");
//       // ServiceInstance serviceInstance = instances.get(0);
//
//        // ribbon默认轮询
////        ServiceInstance serviceInstance = client.choose("USER-SERVICE");
//
//        // 实现负载均衡,拦截器拦截
//        String url = "http://user-service/user/"+id;
//        User user = restTemplate.getForObject(url,User.class);
//        return user;
//    }
    @GetMapping("/{id}")
//    // 开启线程隔离,方法返回类型相同,相同的参数列表
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="2000")
//    })
    /*
        使用feign，更加优雅
     */
    public User queryById(@PathVariable("id") Long id){
        // 实现负载均衡,拦截器拦截
//        String url = "http://user-service/user/"+id;
//        String user = restTemplate.getForObject(url,String.class);
        return  userClient.queryById(id);
    }

    public String queryByIdFallBack(){
       return "服务器正忙!";
    }
}
