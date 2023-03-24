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

    public static void indexSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + (1 + percent / 100);
            employee.setSalary((int) newSalary);
        }
    }

    public static Employee findEmployeeMinSalary(Employee[] employees, int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary()< minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary(Employee[] employees, int department) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary()> maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateSumDepartmentSalary(Employee[] employees, int department) {
        double sumDepartmentSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumDepartmentSalary += employee.getSalary();
            }
        }
        return sumDepartmentSalary;
    }

    public static double calculateMidlSalaryDepartment(Employee[] employees, int department) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                count++;
                sum += employee.getSalary();
            }
        }
        return sum / count;
    }

    public static void indexSalaryDepartment(Employee[] employees, int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary((int)newSalary);
            }
        }
    }


}
