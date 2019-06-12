package cn.fengniaoyun.user.service;

import cn.fengniaoyun.user.mapper.UserMapper;
import cn.fengniaoyun.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: LiangZF
 * @Description:
 * @Date: Created in 21:54 2019/6/3
 * @Modified By: LiangZF
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(long id){
        return userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void inserUser(User user){
        userMapper.insert(user);
    }

}
