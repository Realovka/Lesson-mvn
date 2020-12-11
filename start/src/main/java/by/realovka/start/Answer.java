package by.realovka.start;


import by.realovka.model.Employee;
import by.realovka.service.Calculation;

import java.util.List;

public class Answer {
    public static void main(String[] args) {

        Employee kate = new Employee("Kate", List.of(1200,1300,1400));
        List<Integer> salaryKate = kate.getSalary();
        Employee nik = new Employee("Nik", List.of(1000,1500,1800,2000,2200));
        List<Integer> salaryNik = nik.getSalary();
        Employee pitt = new Employee("Pitt", List.of(1400,1700,1000));
        List<Integer> salaryPitt = pitt.getSalary();
        System.out.printf("Average salary %s - %.2f\n", kate.getName(), Calculation.calcAverageSalary(salaryKate));
        System.out.printf("Average salary %s - %.2f\n", nik.getName(), Calculation.calcAverageSalary(salaryNik));
        System.out.printf("Average salary %s - %.2f", pitt.getName(), Calculation.calcAverageSalary(salaryPitt));

    }
}
