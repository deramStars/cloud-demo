package cn.fengniaoyun.user.web;

import cn.fengniaoyun.user.pojo.User;
import cn.fengniaoyun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 16:22 2019/6/4
 * @Modified By: LiangZF
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id")Long id) {
//        try {
//            Thread.sleep(2000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return userService.findById(id);
    }
}
