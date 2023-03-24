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
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findCalculateMinSalary(Employee[] employees) {
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
        int countId = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countId++;
                System.out.print(countId + ". " + employee.getFullName() + ". ");
            }
        }
    }

}
