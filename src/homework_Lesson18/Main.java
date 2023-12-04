package homework_Lesson18;

public class Main {
    public static void main(String[] args) {

    /* Task 1
    Создать класс Student c полями (переменными) имя и возраст.
    Создать несколько обьектов этого класса. Вывести их на печать
     */

        Student student1 = new Student();
        student1.myName("Teo", 18);

        Student student2 = new Student();
        student2.myName("Leo", 17);

        Student student3 = new Student();
        student3.myName("Kate", 18);

        /* Task 2
        Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
        конструктор и методы для подсчета площади и периметра прямоугольника.
        В классе Main создать несколько обьектов класса Rectangle и вывести на экран
        площадь и периметр каждого.
         */

        Rectangle rectangle1 = new Rectangle();
        rectangle1.Rectangle(5,5);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.Rectangle(2,4);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.Rectangle(1,7);

    }


}
