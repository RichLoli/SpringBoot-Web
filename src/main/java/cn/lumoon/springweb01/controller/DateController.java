package cn.lumoon.springweb01.controller;

import cn.lumoon.springweb01.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: DateController </p>
 * <p>创建时间: 2019/4/2 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description
 * @update 2019/4/2 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Controller
@Slf4j
public class DateController {

    @RequestMapping("/datedemo")
    @ResponseBody
    public User user(User user) {
        log.info(user.toString());
        return new User("张三", new Date());
    }

}
