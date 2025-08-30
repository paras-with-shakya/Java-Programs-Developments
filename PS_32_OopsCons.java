class Employee {
    // int id = 31;
    // String name = "Paras Shakya";

    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My mame is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class PS_32_OopsCons {
    public static void main(String[] args) {
        // System.out.println("This is our costum class");
        Employee ps = new Employee(); // Instantiating a new Employee object
        Employee am = new Employee();// Instantiating a new Employee object

        // Satting Attributes for PS
        ps.id = 1;
        ps.salary = 33;
        ps.name = "Paras Shakya";

        // Satting Attributes for PS
        am.id = 5;
        am.salary = 12;
        am.name = "Aman Prajapti";

        // Printing the Attributes
        // System.out.println(ps.id);
        // System.out.println(ps.name);

        ps.printDetails();
        am.printDetails();

        int salary = am.getSalary();
        System.out.println(salary);
    }
}
