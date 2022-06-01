public class Employee {

    private static int counter = 1;

    private String name;
    private String surname;
    private String patronymicName;
    private double salary;
    private int department;
    private int id;

    public Employee(String name, String surname, String patronymicName, int salary, int department) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public Employee(String name, String surname, String patronymicName, double v) {
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("id %d, ФИО: %s %s %s, ЗП: %.2f  , № отдела: %d ", id, surname, name, patronymicName, salary, department   );
    }
}

