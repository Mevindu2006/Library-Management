public class Librarian extends Person{
    private String employeeId;
    private String position;

    public Librarian(int id, String name, String email, String employeeId, String position){
        super(id, name, email);
        this.employeeId = employeeId;
        this.position = position;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public void displayDetails(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Position: " + getPosition());
    }

}
