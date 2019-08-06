package enums;

import java.util.*;

//This program demonstrates enumerated(枚举) types
public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }

    private String abbreviation;
}
//用户自定义可变参数的方法
/*
public static double max(double...values) //注意括号内的用法
{
    double largest = Double.NEGATIVE_INFINITY;
    for(double v : values)
        if(v > largest) largest = v;
        return largest;
}
可以像下面这样调用参数：
double m = max(3.6, 4.8, -5.5);
 */