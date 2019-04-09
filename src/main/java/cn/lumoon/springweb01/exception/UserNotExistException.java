package cn.lumoon.springweb01.exception;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: UserNotExistException </p>
 * <p>创建时间: 2019/3/27 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description 测试
 * @update 2019/3/27 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
