package holidayrequest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author camer
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass(){  
    }
    
    @AfterClass
    public static void tearDownClass(){  
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        String expResult = "Cameron";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Employee.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        String expResult = "Harrison";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Employee.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        char expResult = 'M';
        char result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHolidaysRem method, of class Employee.
     */
    @Test
    public void testGetHolidaysRem() {
        System.out.println("getHolidaysRem");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        int expResult = 25;
        int result = instance.getHolidaysRem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHolidaysReq method, of class Employee.
     */
    @Test
    public void testGetHolidaysReq() {
        System.out.println("getHolidaysReq");
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        int expResult = 0;
        int result = instance.getHolidaysReq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Cameron";
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Employee.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "Harrison";
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Employee.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 21;
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Employee.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        char gender = 'M';
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHolidaysRem method, of class Employee.
     */
    @Test
    public void testSetHolidaysRem() {
        System.out.println("setHolidaysRem");
        int holidaysRem = 25;
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setHolidaysRem(holidaysRem);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHolidaysReq method, of class Employee.
     */
    @Test
    public void testSetHolidaysReq() {
        System.out.println("setHolidaysReq");
        int holidaysReq = 0;
        Employee instance = new Employee(1, "Cameron", "Harrison", 21, 'M', 25, 0);
        instance.setHolidaysReq(holidaysReq);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
