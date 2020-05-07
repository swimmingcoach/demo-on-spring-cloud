package cn.zealot.demo2.service;

import cn.zealot.demo2.service.impl.UserServiceFallback;
import cn.zealot.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 17:10
 */
@FeignClient(value = "demo1", fallback = UserServiceFallback.class)
public interface UserService {

    @GetMapping("/user/get")
    User getUser();
}
