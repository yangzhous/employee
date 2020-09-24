import com.yang.pojo.Employee;
import com.yang.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        EmployeeService employeeServiceImp = (EmployeeService) context.getBean("EmployeeServiceImp");
        for (Employee employee:employeeServiceImp.queryAllEmployee()) {
            System.out.println(employee);
        }
    }
}
