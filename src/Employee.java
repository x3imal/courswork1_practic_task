public class Employee {

    static int idCounter = 0;
    private String fullName;
    private int department;
    private int salary;
    int id;

    public Employee(String fullName, int department, int salary) {
        this.id = ++idCounter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ФИО: " + fullName + ". Отдел: " + department + ". Зарплата: " + salary;
    }
}
