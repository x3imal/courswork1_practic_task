public class employeeBook {

    private Employee[] employees; //создаем приватный массив

    public employeeBook() {
        this.employees = new Employee[10]; // с помощью конструктора инициализируем массив которой состоит из 10 элементов
    }

    public Employee[] getEmployee() { //получаем доступ к массиву с помощью метода геттера
        return employees;
    } //конструктор поля EmployeeBook

    public void setEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(String fullName, int department, int salary) {
        //в этом методе мы ищем пустую ячейку и проверяем на сходство параметров на наличие уже идентичного сотрудника.
        boolean added = false;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                if (this.employees[i].getFullName().equals(fullName) && this.employees[i].getDepartment() == department && this.employees[i].getSalary() == salary) {
                    System.out.println("Такой сотрудник уже есть");
                    added = true;
                    break;
                }
            } else {
                this.employees[i] = new Employee(fullName, department, salary);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Нельзя добавить сотрудника, все ячейки заняты");
        }
    }

    public void removeEmployee(String fullName, int id) {
        //принимает ФИО и id сотрудника, которого нужно удалить.
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] != null && (employees[i].getFullName().equals(fullName) || employees[i].getId() == id)) { //ведем поиск на сходство заданных параметров и обнуляем ячейку если нашелся сотрудник.
                employees[i] = null;
                break;
            }
        }
    }

    public void findEmployeeAndSetSalaryAndDepartment(String fullName, int newSalary, int newDepartment) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getFullName().equals(fullName)) {
                this.employees[i].setSalary(newSalary);
                this.employees[i].setDepartment(newDepartment);
                break;
            } else {
                System.out.println("Нет такого сотрудника");
            }
        }
    }


    public void pintAll(Employee[] employees) {
        System.out.println("Вывод всех данных в БД: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee + " руб.");
            }
        }
        System.out.println();
    }

    public int calculateTotalSalary(Employee[] employees) {
        System.out.println("Вывод суммы всех зарплат в месяц: ");
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findCalculateMinSalary(Employee[] employees) {
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

    public Employee findCalculateMaxSalary(Employee[] employees) {
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

    public int calculateMidlSalary(Employee[] employees) {
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

    public void printAllFullName(Employee[] employees) {
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

    public void indexSalary(Employee[] employees, double percent) {
        System.out.println("Индексирую зарплату всем сотрудникам на " + percent);
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary((int) newSalary);
            }
        }
        System.out.println();
    }

    public Employee findEmployeeMinSalary(Employee[] employees, int department) {
        System.out.println("Вывожу сотрудника с минимальной зарплатой в отделе: " + department);
        Employee minSalaryEmployee = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findEmployeeMaxSalary(Employee[] employees, int department) {
        System.out.println("Вывожу сотрудника с максимальной зарплатой в отделе: " + department);
        Employee maxSalaryEmployee = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateSumDepartmentSalary(Employee[] employees, int department) {
        System.out.println("Вывожу сумму затрат в отделе: " + department);
        double sumDepartmentSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sumDepartmentSalary += employee.getSalary();
            }
        }
        return sumDepartmentSalary;
    }

    public double calculateMidlSalaryDepartment(Employee[] employees, int department) {
        System.out.println("Вывожу среднюю зарплату по отделу: " + department);
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
                sum += employee.getSalary();
            }
        }
        return sum / count;
    }

    public void indexSalaryDepartment(Employee[] employees, int department, double percent) {
        System.out.println("Индексирую зарплату по указанному отделу: " + department + ", на процент " + percent);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }

    public void printAllEmployeeDepartment(Employee[] employees, int department) {
        System.out.println("Вывожу данные сотрудников по указанному отделу: " + department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Ф.И.О.: " + employee.getFullName() + ", ЗП: " + employee.getSalary() + " руб.");
            }
        }
    }

    public void findEmployeeWithSmallSalary(Employee[] employees, int number) {
        System.out.println("Вывожу сотрудников, у которых зарплата меньше: " + number + " руб.");
        int a = 0; // сделал по подобию Юрия, чтоб можно было контролировать количество сотрудников соответствующих условию
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getId() + 1 + ". Ф.И.О.: " + employee.getFullName() + ", ЗП: " + employee.getSalary() + " руб.");
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Таких сотрудников нет");
        }
    }

    public void findEmployeeWithBigSalary(Employee[] employees, int number) {
        int a = 0; // сделал по подобию Юрия, чтоб можно было контролировать количество сотрудников соответствующих условию
        System.out.println("Вывожу сотрудников, у которых зарплата больше: " + number + " руб.");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > number) {
                System.out.println(employee.getId() + 1 + ". Ф.И.О.: " + employee.getFullName() + ", ЗП: " + employee.getSalary() + " руб.");
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Таких сотрудников нет.");
        }
    }

}
