package cn.zealot.zuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 15:18
 */
@Controller
@RequestMapping("zuul")
public class TestController {

    @GetMapping
    public
    @ResponseBody
    String test() {
        return "I am Zuul.";
    }

}
