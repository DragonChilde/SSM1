package com.ssm.handler;

import com.ssm.beans.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author Lee
 * @create 2019/11/21 14:16
 */
@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "emps",method = RequestMethod.GET)
    public String getMeps(Map<String,Object>map)
    {
        List<Employee> emps = employeeService.getEmps();
        System.out.println(emps);
        map.put("emps",emps);
        return "list";
    }
}
