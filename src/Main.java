
public class Main {
    public static void main(String[] args) {
        Employee IvanovIvanIvanovich = new Employee("Иванов", "Иван", "Иванович");
        Employee PetrovPetrPetrovich = new Employee("Петров","Пётр", "Петрович");
        Employee AlekseevAlekseyAlekseevich = new Employee("Алексеев","Алексей","Алексеевич");
        System.out.println(Employee.printAllEmployeesName());
    }
}
