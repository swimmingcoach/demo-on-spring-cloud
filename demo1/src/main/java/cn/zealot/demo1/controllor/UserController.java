package cn.zealot.demo1.controllor;

import cn.zealot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 16:29
 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/get")
    @ResponseBody
    public User get() {
        return new User(1, "张三");
    }
}
