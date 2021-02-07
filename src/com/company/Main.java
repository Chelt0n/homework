package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Иван", "java разараб", "q@ya.ru", 999622505, 30000, 45);

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иван", "java разараб", "q@ya.ru", 999622505, 30000, 45);
        empArray[1] = new Employee("Сергей", "java разараб", "q@ya.ru", 999622505, 30000, 30);
        empArray[2] = new Employee("Дмитрий", "java разараб", "q@ya.ru", 999622505, 30000, 44);
        empArray[3] = new Employee("Олег", "java разараб", "q@ya.ru", 999622505, 30000, 25);
        empArray[4] = new Employee("Ольга", "java разараб", "q@ya.ru", 999622505, 30000, 19);
        for (Employee employers : empArray) {
            if(employers.getAge()> 40){
                System.out.println(employers.toString());
            }
        }
    }
}
