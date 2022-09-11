public class Main {
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 1);
        employees[1] = new Employee("Semenov", "Semen", "Semenovich", 5);
        allEmployees(employees);
        employees[0].setSalary(20000);
        employees[1].setSalary(30000);
        System.out.println("Общая сумма затрат на зп составляет " + allSalary(employees));

        System.out.println("Минимальная зп равна " + minSalary(employees));
        System.out.println("Максимальная зп равна " + maxSalary(employees));
        System.out.println("Средняя зп равна " + middleSalary(employees));
    }


    public static void allEmployees(Employee employees[]){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i]);
            }
        }
    }

    public static int allSalary(Employee employees[]){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static int minSalary(Employee employees[]){
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if (min > employees[i].getSalary()) {
                    min = employees[i].getSalary();
                }
            }
        }
        return min;
    }
    public static int maxSalary(Employee employees[]){
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if (max < employees[i].getSalary()) {
                    max = employees[i].getSalary();
                }
            }
        }
        return max;
    }

    public static double middleSalary(Employee employees[]){
        double middle = 0;
        int interation = 0;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                middle = middle + employees[i].getSalary();
                interation++;
            }
        }
        return middle / interation;
    }
}