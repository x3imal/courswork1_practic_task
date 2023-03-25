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
        System.out.println();


        //Вывести все данные с БД!
        employeeBook.pintAll(employeeBook.getEmployee());
        System.out.println();

        //Получить сумму затрат на зарплаты в месяц!
        System.out.println(employeeBook.calculateTotalSalary(employeeBook.getEmployee()) + " руб.");
        System.out.println();

        //Найти сотрудника с минимальной зарплатой!
        System.out.println(employeeBook.findCalculateMinSalary(employeeBook.getEmployee())+ " руб.");
        System.out.println();


        //Найти сотрудника с максимальной зарплатой!
        System.out.println(employeeBook.findCalculateMaxSalary(employeeBook.getEmployee()) + " руб.");
        System.out.println();


        //Подсчитать среднее значение зарплат!
        System.out.println(employeeBook.calculateMidlSalary(employeeBook.getEmployee()) + " руб.");
        System.out.println();


        //Получить Ф.И.О. всех сотрудников!
        employeeBook.printAllFullName(employeeBook.getEmployee());
        System.out.println();

        //Проиндексировать зарплату сотрудников на вводимую величину!
        employeeBook.indexSalary(employeeBook.getEmployee(), 10);
        employeeBook.pintAll(employeeBook.getEmployee()); // выводим для проверки изменения зарплаты после индексации
        System.out.println();

        //Найти сотрудника с минимально ЗП по вводимому отделу!
        System.out.println(employeeBook.findEmployeeMinSalary(employeeBook.getEmployee(), 1) + " руб.");
        System.out.println();

        //Найти сотрудника с максимальной ЗП по вводимому отделу!
        System.out.println(employeeBook.findEmployeeMaxSalary(employeeBook.getEmployee(), 2) + " руб.");
        System.out.println();

        //Найти сумму затрат по вводимому отделу!
        System.out.println(employeeBook.calculateSumDepartmentSalary(employeeBook.getEmployee(), 2) + " руб.");
        System.out.println();

        //Найти среднюю зарплату по отделу!
        System.out.println(employeeBook.calculateMidlSalaryDepartment(employeeBook.getEmployee(),  2) + " руб.");
        System.out.println();

        //Проиндексировать зарплату сотрудников указанного отдела!
        employeeBook.indexSalaryDepartment(employeeBook.getEmployee(), 1, 25);
        System.out.println();

        //Напечатать все данные сотрудников указанного отдела!
        employeeBook.printAllEmployeeDepartment(employeeBook.getEmployee(), 1);
        System.out.println();

        //Найти всех сотрудников с зарплатой меньше указанной!
        employeeBook.findEmployeeWithSmallSalary(employeeBook.getEmployee(), 50000);
        System.out.println();

        //Найти всех сотрудников с зарплатой больше указанной!
        employeeBook.findEmployeeWithBigSalary(employeeBook.getEmployee(), 300000);
        System.out.println();

        //Добавляем нового сотрудника
        employeeBook.addEmployee("Никитин Сергей Васильевич", 1, 47000);
        System.out.println();

        //Проверяем на дубликат при создании сотрудника
        employeeBook.addEmployee("Никитин Сергей Васильевич", 1, 47000);
        System.out.println();

        //Удаляем выбранного сотрудника
        employeeBook.removeEmployee("Самойлов Константин Викторович", 5);
        System.out.println();
        employeeBook.pintAll(employeeBook.getEmployee()); //выводим БД для проверки удаления сотрудника

        //Изменяем зарплату указанного сотрудника
        employeeBook.findEmployeeAndSetSalaryAndDepartment("Никитин Сергей Васильевич", 5, 200000);
        System.out.println();
        employeeBook.pintAll(employeeBook.getEmployee()); // выводим БД для проверки изменения зарплаты сотрудника

        //Вывод Ф.И.О всех сотрудников по отделам
        employeeBook.pintAllFullNameWithDepartment(employeeBook.getEmployee());


    }
}