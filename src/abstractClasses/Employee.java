package abstractClasses;

import java.time.*;

public class Employee extends Person
{
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireday = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireday()
    {
        return hireday;
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double bypercent)
    {
        double raise = salary * bypercent / 100;
        salary += raise;
    }
}
