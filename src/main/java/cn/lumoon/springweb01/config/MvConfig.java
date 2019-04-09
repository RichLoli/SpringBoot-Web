package cn.lumoon.springweb01.config;

import cn.lumoon.springweb01.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: MvConfig </p>
 * <p>创建时间: 2019/3/20 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description MVCP配置类
 * @update 2019/3/20 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Configuration
public class MvConfig implements WebMvcConfigurer {

    @Bean
    public ServletRegistrationBean<MyServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new MyServlet(), "/myservlet");
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {

            }
        };
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/atguigu").setViewName("success");
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandleInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/","/index.html","/user/login","/webjars/**","/asserts/**");
            }
        };
    }
}
