package inheritance;

import java.time.*;

public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireday()
    {
        return hireday;
    }

    public void raiseSalary(double bypercent)
    {
        double raise = salary * bypercent / 100;
        salary += raise;
    }
}








