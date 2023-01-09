public class Employee {

    private String name;
    private String surname;
    private String middleName;
    private int department; // Отдел
    private double salary; // Оплата ртуда
    private final int id;
    private static int counter = 1;

    public Employee(String name, String Surname, String MiddleName, int Department, double Salary) {
        this.name = name;
        this.surname = Surname;
        this.middleName = MiddleName;
        this.department = Department;
        this.salary = Salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" + "Name='" + name + '\'' + ", Surname='" + surname + '\'' + ", MiddleName='" + middleName + '\'' + ", Department=" + department + ", Salary=" + salary + '}';
    }
}


