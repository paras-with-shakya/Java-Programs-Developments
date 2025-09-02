
class MyEmployees {
    private int id;
    private String name;

    // int id;
    // String name;
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

public class PS_34_acessModifiers {
    public static void main(String[] args) {

        MyEmployees ps = new MyEmployees();
        // ps.id = 45;
        // ps.name = "Paras Bhai!"; -----> Throws an error due to private access
        // modifier
        // System.out.println(ps.id);
        // System.out.println(ps.name);

        ps.setId(45);
        System.out.println("The Id is:" + ps.getId());
        ps.setName("< Paras is Coder! >");
        System.out.println("The Name is:" + ps.getName());

        // Ques. Circle or perimiter from using setters and getters

    }
}
