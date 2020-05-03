package main.java.behavioral.iterator;

import main.java.behavioral.iterator.models.Iterable;
import main.java.behavioral.iterator.models.Iterator;
import main.java.behavioral.iterator.models.MarketingEmployees;
import main.java.behavioral.iterator.models.SaleEmployees;

import java.util.ArrayList;
import java.util.List;

/**
 * Company has two departments: sale and marketing.
 * To store employees, sales department use array,
 * and marketing department use List
 * As a Client, I want to be able to use same logic to traverse all company's employees and print them
 */
public class IteratorMain {
    public static void main(String[] args) {
        List<String> companyEmployees = new ArrayList<>();

        for(Iterable iterable : getCompanyEmployeesFromDepartments()) {
            for(Iterator iterator = iterable.getIterator(); iterator.hasNext();) {
                companyEmployees.add(iterator.next());
            }
        }

        printCompanyEmployees(companyEmployees);
    }

    private static List<Iterable> getCompanyEmployeesFromDepartments() {
        List<Iterable> employees = new ArrayList<>();
        employees.add(new SaleEmployees());
        employees.add(new MarketingEmployees());
        return employees;
    }

    private static void printCompanyEmployees(List<String> companyEmployees) {
        companyEmployees.forEach(System.out::println);
    }
}
