package cn.lumoon.springweb01.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: MyServlet </p>
 * <p>创建时间: 2019/4/1 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description
 * @update 2019/4/1 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Slf4j
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("这是我的Servlet");
    }
}
