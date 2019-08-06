package equals;

import java.util.HashSet;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) //首先检测超类的equals是否成立
            return false;             //super.equals checked that this and other belong to the same class
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashcode()
    {
        return super.hashCode() + 17 * new Double(bonus).hashCode(); //也可以用：.. + 17 * Double.hashCode(bonus)
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
