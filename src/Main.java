public class Main {


    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {

        employee[0] = new Employee("Иванов Иван Иванович", 1, 25000);
        employee[1] = new Employee("Петров Петр Петрович", 1, 28000);
        employee[2] = new Employee("Сергеенко Сергей Сергеевич", 1, 32000);
        employee[3] = new Employee("Алексеев Алексей Алексеевич", 2, 45000);
        employee[4] = new Employee("Буйнов Александр Александрович", 2, 48000);
        employee[5] = new Employee("Самойлов Константин Викторович",2, 50000);
        employee[6] = new Employee("Петрушкин Сергей Николаевич", 2, 51000);
        employee[7] = new Employee("Княжко Виталий Витальевич", 3, 85000);
        employee[8] = new Employee("Стукин Владимир Витальевич", 4, 92000);
        employee[9] = new Employee("Асуров Алексей Валерьевич", 5, 250000);


        //Вывести все данные с БД!
        EmployeeBook.pintAll(employee);



    }
}