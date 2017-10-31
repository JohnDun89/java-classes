package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by JohnD on 31/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(1000000000.00,"Director Sterling Cooper Draper Price",1, "Roger Sterling", "AB546C", 700000.00 );
    }

    @Test
    public void testGetBudget() {
        assertEquals(1000000000.00, getBudget());
    }



}
