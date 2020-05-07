package cn.zealot.demo1.controllor;

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
@RequestMapping("test")
public class TestController {

    @GetMapping
    public
    @ResponseBody
    String test() {
        return "test";
    }

}
