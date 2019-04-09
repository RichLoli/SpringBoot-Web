package cn.lumoon.springweb01.controller;

import cn.lumoon.springweb01.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;


/**
 * The type Hello controller.
 */
@Controller
public class HelloController {

    /**
     * Hello string.
     *
     * @return the string
     */
    @RequestMapping("hello")
    @ResponseBody
    public String hello(String username) {
        if (username.equals("aaa")) {
            throw new UserNotExistException();
        }
        return "hel";
    }

    /**
     * Success string.
     *
     * @param map the map
     * @return the string
     */
    @RequestMapping("success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }
}
