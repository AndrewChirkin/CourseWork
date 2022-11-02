package courseWork;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private String fullName;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname){
            this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
            this.name = name;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public void setPatronymic(String patronymic){
            this.patronymic = patronymic;
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

    public String toString(){
        return "Сотрудник - " + fullName + "\nЗарплата - " + salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = surname + " " + name + " " + patronymic;
    }
}
