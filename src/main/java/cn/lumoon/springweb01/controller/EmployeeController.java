package cn.lumoon.springweb01.controller;

import cn.lumoon.springweb01.dao.DepartmentDao;
import cn.lumoon.springweb01.dao.EmployeeDao;
import cn.lumoon.springweb01.entities.Department;
import cn.lumoon.springweb01.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * <p>项目名称: spring-web-01 </p>
 * <p>文件名称: EmployeeController </p>
 * <p>创建时间: 2019/3/23 </p>
 * <p>公司信息: ****公司 ****部</p>
 *
 * @author <a href="mail to: loligafeo@gmail.com" rel="nofollow">Loligafeo</a>
 * @version v1.0
 * @description 员工列表
 * @update 2019/3/23 [更改人姓名] [变更描述]
 */
@SuppressWarnings("javadoc")
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departmentCollections = departmentDao.getDepartments();
        model.addAttribute("depts", departmentCollections);
        return "add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        System.out.println("雇员信息是" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") int id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);

        Collection<Department> departmentCollections = departmentDao.getDepartments();
        model.addAttribute("depts", departmentCollections);
        return "add";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee) {
        System.out.println("修改员工信息为" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id") int id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
