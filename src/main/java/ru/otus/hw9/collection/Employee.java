package ru.otus.hw9.collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;


    public static List<String> getEmployeeNames(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            String name = employees.get(i).getName();
            names.add(name);
        }
        System.out.println(names);
        return names;
    }

    public static List<Employee> getMaxOrEqualsAge(List<Employee> employees, int minAge) {
        ArrayList<Employee> res = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getAge() >= minAge) {
                res.add(employee);
            }
        }
        System.out.println(res);
        return res;
    }

    public static boolean getMinMiddleAge (List<Employee> employees, int minMidAge) {
        int middleAge = 0;
        int sumAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            int age = employees.get(i).getAge();
            sumAge += age;
        }
        middleAge = sumAge/employees.size();
        boolean res = middleAge > minMidAge;
        System.out.println(res);
        return res;
    }

    public static Employee getYongEmployee (List<Employee> employees) {
        Employee minAgeEmployee = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (minAgeEmployee.getAge() > employee.getAge()) {
                minAgeEmployee = employee;
            }
        }
        System.out.println( minAgeEmployee);
        return minAgeEmployee;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

