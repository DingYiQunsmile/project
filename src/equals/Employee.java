package equals;

import java.time.*;
import java.util.Objects;

public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject)
    {
        //a quick test to see if the objects are identical
        if(this == otherObject) return true;

        //must return false if the explicit(显式) parameter(参数) is null
        if(otherObject == null) return false;

        //if the class don't match(匹配),they can't be equal
        if(getClass() != otherObject.getClass()) return false;

        //now we know otherObject is a non-null Employee
        Employee other =  (Employee) otherObject;

        //test whether the fields have identical values
        return Objects.equals(name, other.name) && salary ==other.salary
                && Objects.equals(hireDay, other.hireDay); // 用Objects.equals方法防止name或者hireDay为null的情况
    }

    public int hashCode()
    {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
}
