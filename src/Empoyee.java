public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Employee(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getFullName() {
        return this.surname + " " + this.name + " " + this.patronymic;
    }

    // public String getEmployeeList() {
    //    return Employee.printAllEmployeesName();
    // }

    //   public static void printAllEmployeesName() {
    //      for (int employees : Employee) {
      //     System.out.println(Employee.getFullName());
}

    }
            }
