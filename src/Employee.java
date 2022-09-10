public class Employee {
    private String firstName;
    private String SecondName;
    private String threeName;

    private int department;

    private int salary;
    private int id;
    static private int idCount = 1;

    public Employee(String firstName, String secondName, String threeName, int department){
        id = idCount++;
        this.firstName = firstName;
        this.SecondName = secondName;
        this.threeName = threeName;
        this.department = department;
    }

    public String getFirstName() { return firstName; }
    public String getSecondName(){
        return SecondName;
    }
    public String getThreeName() { return threeName; }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Фамилия "+ firstName + " Имя " + SecondName + " Отчество " + threeName + " ID " + this.id;
    }
}
