package cn.zealot.demo2.controller;

import cn.zealot.demo2.service.UserService;
import cn.zealot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 17:09
 */
@Controller
@RequestMapping("user")
public class User2Controller {

    @Autowired
    private UserService userService;

    @GetMapping("get")
    @ResponseBody
    public User get() {
        return userService.getUser();
    }
}
