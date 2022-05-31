
public class Main {

    private static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = generateEmployee(i+1, (int) (1 + (5 - 1) * Math.random());
        }
        EMPLOYEES[0] = new Employee("Имя1"," Фамилия 1", " Очество" , );

    }
    private static Employee generateEmployee(int i){
            int start = 30_000;
            int end = 80_000;
        return new Employee(
                "Имя"+i,
                " Фамилия 1"+i,
                " Очество"+i,
                 start+(end-start) * Math.random(),
                department,

        );
    }
}