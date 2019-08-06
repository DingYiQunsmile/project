package abstractClasses;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        //fill the people array with Student and Employee objects
        people[0] = new Employee("Harry hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria morris", "computer science");

        //print out names descriptions of all the Person objects
        for(Person p : people)
        {
            System.out.println(p.getName() +"," + p.getDescription());
        }
    }
}
