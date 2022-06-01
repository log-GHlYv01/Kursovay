
public class Main {

    private static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = generateEmployee(i + 1, (int) (1 + (6 - 1 ) * Math.random()));
            System.out.println(EMPLOYEES[i]);
        }
        printAllEmployees();
        double totalSalaries = totalSalaries();
        System.out.println("Сумма зп всех работников за один месяц: " + totalSalaries);
        Employee findEmployeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println(" Сотрудник с минималкой в ЗП"+findEmployeeWithMinSalary);
        Employee findEmployeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println(" Сотрудник с максималкой в ЗП"+findEmployeeWithMaxSalary);
        double averageSalary = averageSalary();
        System.out.println("Усредненная  зп всех работников за один месяц: " + averageSalary);
        printFullAllNameEmployees();
    }

        private static double averageSalary() {
            return totalSalaries()/ EMPLOYEES.length;
            }
        private static Employee findEmployeeWithMinSalary() {
            double minSalary = Double.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < EMPLOYEES.length; i++) {
                if (EMPLOYEES[i].getSalary() < minSalary) {
                    minSalary = EMPLOYEES[i].getSalary();
                    index = i;
                }
            }
            if (index !=-1) {
                return EMPLOYEES[index];
                }else {
                return null;
            }

        }
        private static Employee findEmployeeWithMaxSalary() {
            double maxSalary = Double.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < EMPLOYEES.length; i++) {
                if (EMPLOYEES[i].getSalary() > maxSalary) {
                    maxSalary = EMPLOYEES[i].getSalary();
                    index = i;
                }
            }
            if (index !=-1) {
                return EMPLOYEES[index];
            }else {
                return null;
            }
        }

    private static double totalSalaries() {
        double sum= 0;
            for (Employee employee: EMPLOYEES){
                sum +=employee.getSalary();
            }
            return sum;
    }
    private static void printFullAllNameEmployees(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getName()+" "+employee.getPatronymicName() +" "+employee.getSurname());
        }
    }
    private static void printAllEmployees(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static Employee generateEmployee(int i, int department){
            int start = 30_000;
            int end = 80_000;

        return new Employee(
                "Имя"+i,
                " Фамилия 1"+i,
                " Очество"+i,
                (int) (start+(end-start) * Math.random()),
                department
                );
    }
}
