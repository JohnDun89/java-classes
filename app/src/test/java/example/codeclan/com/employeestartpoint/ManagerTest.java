package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by JohnD on 31/10/2017.
 */

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Head of Onion Production",1, "Tim", "AB126546C", 300000.00 );
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Head of Onion Production",manager.getDeptname());
    }
}
