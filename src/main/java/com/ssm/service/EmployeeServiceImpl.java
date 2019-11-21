package com.ssm.service;

import com.ssm.beans.Employee;
import com.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @create 2019/11/21 14:15
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }
}
