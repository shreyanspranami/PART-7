//shreyans j. pranami 21CE110
import java.util.*;

class Employee implements Comparable<Employee>
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.getAge();
    }
}

class Main
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("John", 15),
                new Employee("Sam", 20),
                new Employee("Joe", 10)
        ));

        Collections.sort(employees);
        System.out.println(employees);
        System.out.println("shreyans 21CE110");
    }
}