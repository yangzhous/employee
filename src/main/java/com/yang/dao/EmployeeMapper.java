package com.yang.dao;

import com.yang.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    public int addEmployee(Employee employee);

    public int deleteEmployee(@Param("bookID") int id);

    public int updateEmployee(Employee employee);

    public Employee queryEmployeeByID(@Param("bookID") int id);

    public List<Employee> queryAllEmployee();
}
