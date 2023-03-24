public class EmployeeBook {

    public static void pintAll(Employee[] employees) {
        System.out.println("Вывод всех данных в БД: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.print(employee);
            }
            System.out.println();
        }
    }

    public static int calculateTotalSalary(Employee[] employees) {
        System.out.println("Вывод суммы всех зарплат в месяц: ");
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findCalculateMinSalary(Employee[] employees) {
        System.out.println("Вывожу сотрудника с минимально зарплатой: ");
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    public static Employee findCalculateMaxSalary(Employee[] employees) {
        System.out.println("Вывожу сотрудника с максимально зарплатой :");
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    public static int calculateMidlSalary(Employee[] employees) {
        System.out.println("Вывожу среднее значение зарплат: ");
        int midlSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                midlSalary += employee.getSalary();
                count++;
            }
        }
        return midlSalary / count;
    }

    public static void printAllFullName(Employee[] employees) {
        System.out.println("Вывожу Ф.И.О. всех сотрудников: ");
        int countId = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countId++;
                System.out.println(countId + ". " + employee.getFullName() + ". ");
            }
        }
        System.out.println();
    }

}
