package example.codeclan.com.employeestartpoint;

/**
 * Created by JohnD on 31/10/2017.
 */

public class Manager extends Employee {

    private String deptName;

    public Manager (String deptName, int id, String name, String socialSecurityNumber, double salary) {
        super(id, name, socialSecurityNumber, salary);
        this.deptName = deptName;
    }
}






//    public Manager() {
//        super(int, String, String, double);
//    }
//}

/*
private int id;
private String name;
private String socialSecurityNumber;
private double salary;

public Manager {
this.id = id;
this.name = name;
this.socialSecurityNumber = socialSecurityNumber;
this.salary = salary;
}
*/
