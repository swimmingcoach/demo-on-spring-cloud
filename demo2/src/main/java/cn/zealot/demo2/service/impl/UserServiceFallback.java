package cn.zealot.demo2.service.impl;

import cn.zealot.demo2.service.UserService;
import cn.zealot.pojo.User;
import org.springframework.stereotype.Component;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 17:34
 */
@Component
public class UserServiceFallback implements UserService {
    @Override
    public User getUser() {
        return new User(0, "请求超时", "");
    }
}
