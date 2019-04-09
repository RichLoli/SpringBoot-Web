package cn.lumoon.springweb01.controller;

import cn.lumoon.springweb01.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: DemoController </p>
 * <p>创建时间: 2019/3/28 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description
 * @update 2019/3/28 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Controller
@Slf4j
public class DemoController {

    @ModelAttribute
    public User popular() {
        User user = new User();
        user.setName("我是你爸");
        log.info("这是mdoel");
        log.info(user.hashCode() + "");
        return user;
    }

    @RequestMapping("/demo")
    public String hello(@ModelAttribute String u) {
        log.info("这是hello");
        log.info(u.hashCode() + "");
        return "demo";
    }

}
