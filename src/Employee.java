public class Employee {
    String employeeID;
    String name;
    static String designation="Lab Attendant";

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }
    public Employee(){
        this.employeeID=" ";
        this.name=" ";
    }
}
