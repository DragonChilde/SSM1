package com.ssm.mapper;

import com.ssm.beans.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Lee
 * @create 2019/11/14 11:43
 */
public interface EmployeeMapper {

    public List<Employee> getEmps();
}
