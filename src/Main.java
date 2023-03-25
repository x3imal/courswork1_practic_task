public class Main {


    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
       employeeBook.addEmployee("Петров Петр Петрович", 1, 28000);
       employeeBook.addEmployee("Сергеенко Сергей Сергеевич", 1, 32000);
       employeeBook.addEmployee("Алексеев Алексей Алексеевич", 2, 45000);
       employeeBook.addEmployee("Буйнов Александр Александрович", 2, 48000);
       employeeBook.addEmployee("Самойлов Константин Викторович",2, 50000);
       employeeBook.addEmployee("Петрушкин Сергей Николаевич", 2, 51000);
       employeeBook.addEmployee("Княжко Виталий Витальевич", 3, 85000);
       employeeBook.addEmployee("Стукин Владимир Витальевич", 4, 92000);
       employeeBook.addEmployee("Асуров Алексей Валерьевич", 5, 250000);


        //Вывести все данные с БД!
        employeeBook.pintAll(employeeBook.getEmployee());
        System.out.println();
//
//        //Получить сумму затрат на зарплаты в месяц!
//        System.out.println(EmployeeBook.calculateTotalSalary(employee) + " руб.");
//        System.out.println();
//
//
//        //Найти сотрудника с минимальной зарплатой!
//        System.out.println(EmployeeBook.findCalculateMinSalary(employee)+ " руб.");
//        System.out.println();
//
//
//        //Найти сотрудника с максимальной зарплатой!
//        System.out.println(EmployeeBook.findCalculateMaxSalary(employee) + " руб.");
//        System.out.println();
//
//
//        //Подсчитать среднее значение зарплат!
//        System.out.println(EmployeeBook.calculateMidlSalary(employee) + " руб.");
//        System.out.println();
//
//
//        //Получить Ф.И.О. всех сотрудников!
//        EmployeeBook.printAllFullName(employee);
//        System.out.println();
//
//        //Проиндексировать зарплату сотрудников на вводимую величину!
//        EmployeeBook.indexSalary(employee, 10);
//        EmployeeBook.pintAll(employee);
//        System.out.println();
//
//        //Найти сотрудника с минимально ЗП по вводимому отделу!
//        System.out.println(EmployeeBook.findEmployeeMinSalary(employee, 1) + " руб.");
//        System.out.println();
//
//        //Найти сотрудника с максимальной ЗП по вводимому отделу!
//        System.out.println(EmployeeBook.findEmployeeMaxSalary(employee, 2) + " руб.");
//        System.out.println();
//
//        //Найти сумму затрат по вводимому отделу!
//        System.out.println(EmployeeBook.calculateSumDepartmentSalary(employee, 2) + " руб.");
//        System.out.println();
//
//        //Найти среднюю зарплату по отделу!
//        System.out.println(EmployeeBook.calculateMidlSalaryDepartment(employee, 2) + " руб.");
//        System.out.println();
//
//        //Проиндексировать зарплату сотрудников указанного отдела!
//        EmployeeBook.indexSalaryDepartment(employee, 1, 25);
//        System.out.println();
//
//        //Напечатать все данные сотрудников указанного отдела!
//        EmployeeBook.printAllEmployeeDepartment(employee, 2);
//        System.out.println();
//
//        //Найти всех сотрудников с зарплатой меньше указанной!
//        EmployeeBook.findEmployeeWithSmallSalary(employee, 50000);
//        System.out.println();
//
//        //Найти всех сотрудников с зарплатой больше указанной!
//        EmployeeBook.findEmployeeWithBigSalary(employee, 50000);

    }
}