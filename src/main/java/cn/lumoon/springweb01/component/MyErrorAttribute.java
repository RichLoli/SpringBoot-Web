package cn.lumoon.springweb01.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: MyErrorAttribute </p>
 * <p>创建时间: 2019/3/27 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description d
 * @update 2019/3/27 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Component
public class MyErrorAttribute extends DefaultErrorAttributes {


    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company", "atguigu");
        map.put("ext", webRequest.getAttribute("ext", 0));
        return map;
    }
}
