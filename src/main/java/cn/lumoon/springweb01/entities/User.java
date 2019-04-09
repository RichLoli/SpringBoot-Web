package cn.lumoon.springweb01.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: User </p>
 * <p>创建时间: 2019/3/28 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description
 * @update 2019/3/28 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private Date date;

}
