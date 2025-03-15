package ru.otus.hw9.collection;


import java.util.ArrayList;
import java.util.List;


public class HomeWork9 {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = getMinMaxNumbers(1, 10);
        getSumNumbers(numbers);
        replaceSell(3, numbers);
        increase(1, numbers);

        Employee employee1 = new Employee("Ivan", 25);
        Employee employee2 = new Employee("Sergey", 30);
        Employee employee3 = new Employee("Vladimir", 46);
        List<Employee> employees = List.of(employee1, employee2,employee3);
        Employee.getEmployeeNames(employees);
        Employee.getMaxOrEqualsAge(employees, 25);
        Employee.getMinMiddleAge(employees, 27);
        Employee.getYongEmployee(employees);
    }

    public static ArrayList<Integer> getMinMaxNumbers(int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        return  numbers;
    }

    public static int getSumNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 5) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void replaceSell (int number, ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != null) {
                numbers.set(i, number);
            }
        }
        System.out.println(numbers);
    }

    public static void increase(int number, ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int res = numbers.get(i) + number;
            numbers.set(i, res);
        }
        System.out.println(numbers);
    }
}
