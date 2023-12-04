package homework_Lesson18;

public class Student {

    public String name;
    public int age;


    public void myName(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Name of Student: " + name);
        System.out.println(name+ "'s Age: " + age);
        System.out.println();
    }
}
