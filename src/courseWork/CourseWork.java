package courseWork;

public class CourseWork {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 1000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 2, 2000);
        employees[2] = new Employee("Алексеев", "Алексей", "Алексеевич", 3, 1300);
        employees[3] = new Employee("Андреев", "Андрей", "Андреевич", 4, 1060);
        employees[4] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 5, 4000);
        employees[5] = new Employee("Антонов", "Антон", "Антонович", 5, 7000);
        employees[6] = new Employee("Степанов", "Степан", "Степанович", 4, 2050);
        employees[7] = new Employee("Сергеев", "Сергей", "Сергеевич", 3, 2400);
        employees[8] = new Employee("Александров", "Александр", "Александрович", 2, 1230);
        employees[9] = new Employee("Васильев", "Василий", "Васильевич", 1, 1234);

        System.out.println("Сумма всех заплат сотрудников " + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeWithMinSalary());
        System.out.println(employeesList());
        System.out.println("Средняя зарплата сотрудников: " + calculateAverageSalary());
        }
    public static int calculateSumSalary(){
        int sum = 0;
        for(Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeWithMaxSalary(){
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employees){
            if(employee != null && employee.getSalary() > max){
                max = employee.getSalary();
                targetEmployee = employee;

            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMinSalary(){
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employees){
            if(employee != null && employee.getSalary() < min){
                min = employee.getSalary();
                targetEmployee = employee;

            }
        }
        return targetEmployee;
    }
    public static String employeesList() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }

        return null;
    }
    public static int calculateAverageSalary(){
        int avSalary = calculateSumSalary() / employees.length;
        return avSalary;
    }


}
