/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.ContactFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.app.factories.NameFactory;
import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.crud.services.EmployeeCrudService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DibaW
 */
public class EmployeeTest {
     private EmployeeCrudService employeeCrudService;
     //private CourseService courseService;
    private Long id;
    private static ApplicationContext ctx;

    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ctx = new ClassPathXmlApplicationContext("classpath:com/wandile/documenttracking/app/conf/applicationContext-*.xml");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
      @Test
      public void createEmployee() {
          
        Name name = NameFactory.createName("Wandile", "Diba");
        Contact cont = ContactFactory.createContact(021, 012, "dibaw@dot.gov.za");
        Map<String,String>Values = new HashMap<String, String>();
        Values.put("subject", "License Cards");
        Values.put("Author", "Mr Diba");
        Date dat = new Date();
       // SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yy");
         //Document_Info = DocInfoFactory.createDocFactory(Values, dat);
        
        Employee emp = EmployeeFactory.createEmployee( name, cont, 1232);
        
        employeeCrudService = (EmployeeCrudService)ctx.getBean("employeeCrudService");
        employeeCrudService.persist(emp);
        id = emp.getId();
        Assert.assertNotNull(emp);
     }
}
