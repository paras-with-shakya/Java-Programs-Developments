
class NewEmployee {
    private int id;
    private String name;

    public NewEmployee() {
        id = 0;
        name = "Paras shakya";
    }

    public NewEmployee(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public NewEmployee(String myName) {
        id = 1;
        name = myName;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class PS_34_construtors {
    public static void main(String[] args) {
        // NewEmployee ps = new NewEmployee("Aranav Shakya", 44);
        NewEmployee ps = new NewEmployee();

        // ps.setName("Paras is Coder!");
        // ps.setId(45);
        System.out.println("The Id is:" + ps.getId());
        System.out.println("The Name is:" + ps.getName());
        // ps.setId(45);
        // System.out.println("The Id is:" + ps.getId());
        // ps.setName("< Paras is Coder! >");
        // System.out.println("The Name is:" + ps.getName());

    }
}
