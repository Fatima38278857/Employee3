public class Main {
    public static Employee[] employee = new Employee[10];
    public static void main(String[] args) {


        employee[0] = new Employee("Фатима", "Аксагова", "Магомедовна", 1, 30_00);
        employee[1] = new Employee("Марем", "Султыгова", "Уматгиреевна", 4, 90_00);
        employee[2] = new Employee("Залина", " Аксагова", "Магомедовна", 3, 40_00);
        employee[3] = new Employee("Имран", "Гасаров", "Харонович", 5, 80_00);
        employee[4] = new Employee("Мадина", "Аксагова", " Магомедовна", 2, 50_00);
        employee[5] = new Employee("Магомед", "Аксагов", "Султанович", 5, 25_00);
        employee[6] = new Employee("Макка", "Аксагова", "Магомедовно", 3, 90_00);
        employee[7] = new Employee("Хава", "Аксагова", "Магомедовна", 1, 10_00);
        employee[8] = new Employee("Танзила", "Аксагова", "Магомедовна", 2, 50_00);
        employee[9] = new Employee("Ева", "Гасарова", " Хароновна", 4, 30_00);

        getMinMaxSalary(employee);

        System.out.println(calculateTheSalary(employee)/employee.length);
    }

    public static void printAllWorkers(Employee[] employees) { // Распечатка работников
        int i = 0;
        while (i < employees.length) {
            System.out.println(employees[i]);
            System.out.println("-----------------------------");
            i++;
        }
    }

    public static double calculateTheSalary(Employee[] employees) { //  Сумму затрат на зарплаты в месяц
        double wageRate = 0;
        for (int i = 0; i < employees.length; i++) {
            wageRate = (double) (wageRate + employees[i].getSalary());

        }
        return wageRate;
    }

    public static void getMinMaxSalary(Employee[] employees) { // Минимальное и Максимальное значение

        String[] maxS = new String[1];
        String[] minS = new String[1];
        double max = 0;
        double min = employee[0].getSalary();

        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                maxS[0] = employee[i].toString();
            }
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                minS[0] = employee[i].toString();

            }
        }
        System.out.println("Сотрудник с максимальной заработной платой: " + maxS[0]);
        System.out.println("Сотрудник с минимальной заработной платой: " + minS[0]);
    }


    public static void printNameWorkers(Employee[] employees) { // Распечатать сотрудников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getMiddleName());
        }






    }
}