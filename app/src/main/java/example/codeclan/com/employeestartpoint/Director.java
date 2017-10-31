package example.codeclan.com.employeestartpoint;

/**
 * Created by JohnD on 31/10/2017.
 */

public class Director extends Manager {

    private Double budget;

    public Director(Double budget, String deptName, int id, String name, String socialSecurityNumber, double salary) {
        super(deptName, id, name,socialSecurityNumber, salary);
        this.budget = budget;
    }
}
