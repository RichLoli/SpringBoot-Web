package cn.lumoon.springweb01.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: LoginHandleInterceptor </p>
 * <p>创建时间: 2019/3/22 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description 登录状态拦截器
 * @update 2019/3/22 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
public class LoginHandleInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("msg", "没有权限请先登录");
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
