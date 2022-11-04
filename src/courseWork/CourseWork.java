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
        indexSalary(4);
        System.out.println("Сотрудник с минимальной зарплатой в 1 отделе - " + getEmployeeWithMinSalaryInDepartment());
        System.out.println("Сотрудник с максимальной зарплатой в 1 отделе - " + getEmployeeWithMaxSalaryInDepartment());
        System.out.println("Сумма заплат в 1 отделе равна - " + departmentSumSalary());
        System.out.println("Средняя заплата в 1 отделе равна - " + averageDepartmentSalary());
        indexSalaryInDepartment(8,1);
        printDepartmentEmployees(3);
        employeesWithSalaryLessThanNumber(1500);
        employeesWithSalaryMoreThanNumber(2000);

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
            System.out.println(employee.getFullName());
        }

        return "________________";
    }
    public static void indexSalary(double index){

        double indexedSalary = 0;
        for(Employee employee : employees) {
            indexedSalary = (double) employee.getSalary() * (index / 100 + 1);
            String result = String.format("%.2f",indexedSalary);
            System.out.println("Сотрудник " + employee.getFullName() + " будет иметь зарплату " + result + " после индексирования.");

        }

    }

    public static int calculateAverageSalary(){
        int avSalary = calculateSumSalary() / employees.length;
        return avSalary;
    }
    public static Employee getEmployeeWithMinSalaryInDepartment() {
        int min = Integer.MAX_VALUE;
        Employee targetDepartmentEmployee = null;
        int department = 1;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min && employee.getDepartment() == department) {
                min = employee.getSalary();
                targetDepartmentEmployee = employee;

            }
        }
        return targetDepartmentEmployee;
    }
    public static Employee getEmployeeWithMaxSalaryInDepartment() {
        int max = Integer.MIN_VALUE;
        Employee targetDepartmentEmployee = null;
        int department = 1;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max && employee.getDepartment() == department) {
                max = employee.getSalary();
                targetDepartmentEmployee = employee;

            }
        }
        return targetDepartmentEmployee;
    }


    public static int departmentSumSalary(){
        int sum = 0;
        int department = 1;
        for(Employee employee : employees){
            if (employee != null && employee.getDepartment() == department){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int averageDepartmentSalary(){
        int department = 1;
        int avSalary = 0;
        for(Employee employee : employees){
            if(employee != null && department == employee.getDepartment()){
                avSalary = departmentSumSalary() / numberOfEmployeesInDepartment();
            }
        }
        return avSalary;
    }
    public static int numberOfEmployeesInDepartment(){
        int department = 1;
        int numberOfPeople = 0;
        for (Employee employee : employees){
            if(employee != null && department == employee.getDepartment()){
             numberOfPeople++;
            }
        }
        return numberOfPeople;
    }
    public static void indexSalaryInDepartment(double index, int department){

        double indexedSalary = 0;
        for (Employee employee : employees){
            if(employee != null && department == employee.getDepartment()){
                indexedSalary = (double) employee.getSalary() * (index / 100 + 1);
                String result = String.format("%.2f",indexedSalary);
                System.out.println("Сотрудник " + employee.getFullName() + " будет иметь зарплату " + result + " после индексирования.");
            }
        }
    }
    public static void printDepartmentEmployees(int department){
        for (Employee employee : employees){
            if(employee != null && department == employee.getDepartment()){
                System.out.println(employee.getFullName() + " , зарплата - " + employee.getSalary() + " рублей." );
            }
        }
    }
    public static void employeesWithSalaryLessThanNumber(int number){
        System.out.println("Сотрудники, зарплата которых меньше числа " + number);
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < number){

                System.out.println(employee.getId() + " - " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }
    public static void employeesWithSalaryMoreThanNumber(int number){
        System.out.println("Сотрудники, зарплата которых больше или равна числу " + number);
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() >= number){

                System.out.println(employee.getId() + " - " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }
}
