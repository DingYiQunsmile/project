package abstractClasses;

public class Student extends Person
{
    private String major;

    public Student(String name, String major)
    {
        //pass name to superclass constructor(将name传递给超类构造函数)
        super(name);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
