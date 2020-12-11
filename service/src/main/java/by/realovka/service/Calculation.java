package by.realovka.service;

import java.util.List;

public class Calculation {

    public static  double calcAverageSalary(List<Integer> list) {
        int allSalary = list.stream().mapToInt(Integer::intValue).sum();
        return (double) allSalary / list.size();
    }
}
