package inheritance;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getsalary()
    {
        double basesalary = super.getSalary();
        return basesalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }
}
