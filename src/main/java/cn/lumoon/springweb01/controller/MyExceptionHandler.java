package cn.lumoon.springweb01.controller;

import cn.lumoon.springweb01.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: MyExceptionHandler </p>
 * <p>创建时间: 2019/3/27 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description 的
 * @update 2019/3/27 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());
        request.setAttribute("javax.servlet.error.status_code", 400);
        request.setAttribute("ext", map);
        return "forward:/error";
    }

}
