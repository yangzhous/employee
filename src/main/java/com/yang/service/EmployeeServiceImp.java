package com.yang.service;

import com.yang.dao.EmployeeMapper;
import com.yang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    public EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }

    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    public Employee queryEmployeeByID(int id) {
        return employeeMapper.queryEmployeeByID(id);
    }

    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }
}
