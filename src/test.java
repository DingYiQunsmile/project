/*import java.util.Scanner;
import static java.lang.Math.*;
public class test {
    public static final double X = 2.54;
    public static void main(String[] args)
    {
        int  x = 4;
        double y = sqrt(x);
        int z = (x & (1 << 3)) >> 3;
        String greeting = "hello";
        String s = greeting.substring(2,5);
        String all = String.join("/","S","M","L","XL");
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = in.nextLine();
        String fristname = in.next();
        System.out.println(fristname);
        System.out.println(name);
        System.out.println(s);
        System.out.println(z);
        System.out.println(all);
        System.out.println(X%y  + "we will not use 'hello world!'");
    }
}*/
/*import java.lang.reflect.Array;
import java.util.*;

public class test
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you need to retire? ");
        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();
        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
        }

        System.out.println("You can retire in " + year + " year.");

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * a.length * 5);
        }
        Arrays.sort(a);
        for (int f:a) {
            System.out.println(f);
        }
        System.out.println(Arrays.toString(a));
        System.out.print(a.length);
    }
}*/
/*import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ") ;
        int k = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        int[] result = new int[k];
        for(int i = 0; i < result.length; i++)
        {
            int r = (int)(Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination.It'will make you rich!");
        for (int r:result)
        {
            System.out.println(n);
        }
    }
}*/

/*public class test
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;
        double[][] balances = new double[NYEARS][NRATES];
        for(int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;
        for(int i = 1; i < balances.length; i++)
        {
            for(int j = 0; j < balances[i].length; j++)
            {
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for(int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%",100 * interestRate[j]);
        System.out.println();
        for (double[] row : balances)
        {
            for(double b : row)
                System.out.printf("%10.2f",b);
            System.out.println();
        }
    }
}*/

/*import java.time.*;

public class test
{
    public static void main(String[] args)
    {
        LocalDate date =  LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);  //Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sun");
        for(int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getDayOfMonth() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1)  System.out.println();
    }
}*/

//用户自定义类

/*import java.time.*;

public class test
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];  //构造器总是伴随着new操作符的执行被调用
        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);
        for (Employee e : staff)
            e.raiseSalary(5);
        for(Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireday());
    }
}
class Employee
{
    private String name;
    private double salary;
    private  LocalDate hireday;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
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

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}*/

//This program demonstrates static method

/*public class test
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        //print out information about all Employee objects
        for(Employee e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + "id=" + e.getId() + "salary=" + e.getSalary());
        }

        int n = Employee.getNextID(); //calls static method
        System.out.println("next available id=" + n);
    }
}

class Employee
{
    private static int nextID = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n,double s)
    {
        name = n;
        salary = s;
        id = 0;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return id;
    }
    public void setId()
    {
        id = nextID;
        nextID++;
    }
    public static int getNextID()
    {
        return nextID; //return static field
    }

    public static void main(String[] args)
    {
        Employee e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}*/

//This program demonstrates parameter passing

/*public class test
{
    public static void main(String[] args)
    {
        //Test 1:Methods can't modify(修改) numeric(数值) parameters(参数)

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        //Test 2:Methods can change the state of object parameters

        System.out.println("\nTesting tripleValue");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        //Test 3:Methods can't attach new oobjects to objects parameters

        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a,b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

        //Test 4:Methods works(注意封装类的对象要先先 . 类内的引用)

        System.out.println("\nTesting Eswap:");
        Employee c = new Employee("Alice",70000);
        Employee d = new Employee("Bob",60000);
        Employeewrap E1 = new Employeewrap(c);
        Employeewrap E2 = new Employeewrap(d);
        System.out.println("Before: c=" + E1.employee.getName());
        System.out.println("Before: d=" + E2.employee.getName());
        Eswap(E1,E2);
        System.out.println("After: c=" + E1.employee.getName());
        System.out.println("After: d=" + E2.employee.getName());
    }

    public static void tripleValue(double x)  //dosen't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x)  //works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y =temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }

    public static void Eswap(Employeewrap E1, Employeewrap E2)
    {
        Employee temp = E1.employee;
        E1.employee = E2.employee;
        E2.employee = temp;
        System.out.println("End of method: E1=" + E1.employee.getName());
        System.out.println("End of method: E2=" + E2.employee.getName());
    }
}

class Employeewrap  //用封装类可以实现交换对象
{
    Employee employee;
    Employeewrap(Employee e)
    {
        this.employee= e;
    }
}

class Employee //simplified(简化了的) Employee class
{
    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double bypercent)
    {
        double raise = salary *bypercent / 100;
        salary += raise;
    }
}*/

//This program demonstrates object construction
//以下包含：重载构造器，this(...)调用另一个构造器，无参数构造器，对象、静态初始化块，实例域初始快

/*import java.util.*;

public class test {
    public static void main(String[] args) {
        //fill the staff array(数组) with three Employee objects(对象)
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id =" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee
{
    private static int nextId;

    private int id;
    private String name = " ";  //instance(实例) field initialization(初始化)
    private double salary;

    //static initialization block
    static
    {
        //set nextId to a random number between 0 and 9999
        Random generator = new Random(); //先创建一个Random类的对象
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded(重载的) constructors(构造器)
    public Employee(String n,double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        //calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    //the default(默认) constructor
    public Employee()
    {
        //name initialized to " "--see above(private String name = "";)
        //salary not explicitly(明确地) set--initialized to 0
        //id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }
}*/