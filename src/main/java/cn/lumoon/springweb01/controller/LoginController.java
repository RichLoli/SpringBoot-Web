package cn.lumoon.springweb01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: LoginController </p>
 * <p>创建时间: 2019/3/22 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description 登录控制器
 * @update 2019/3/22 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(String username, String password, Map<String, Object> map
            , HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("user", "ok");
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名或密码错误");
            return "index";
        }
    }
}
