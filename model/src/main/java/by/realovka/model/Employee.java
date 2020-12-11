package by.realovka.model;

import java.util.List;

public class Employee{
    private String name;
    private List<Integer> salary;

    public Employee(String name, List<Integer> salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSalary() {
        return salary;
    }

    public void setSalary(List<Integer> salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "by.realovka.model.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
