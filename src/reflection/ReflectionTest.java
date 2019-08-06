package reflection;

import java.util.*;
import java.lang.reflect.*;

//This program uses reflection to print all features of a class.
public class ReflectionTest
{
    public static void main(String[] args) {
        //read class name from command line args or use input
        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            //print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class)
                System.out.print("extends " + superCl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Print all constructors of a class
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor C : constructors)
        {
            String name = C.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            //print parameter types
            Class[] paramTypes = C.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++)
            {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param cl a class
     */
    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();

        for(Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");
            //print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            //print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++)
            {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Print all fields of a class
     * @param cl a class
     */

    public static void printFields(Class cl)
    {
        Field[] fields = cl.getDeclaredFields();

        for(Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}

//暂时跳过java核心技术卷一的：
// 5.7.4(使用反射分析对象)
// 5.7.5(使用反射编写泛型数组代码)
// 5.7.6(调用任意方法)
//以后遇到再解决