package homework_Lesson18;

public class Rectangle {

    public int length;
    public int width;

    public void Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        System.out.println("Area of This Rectangle is: " + (length * width));
        System.out.println("Perimeter of This Rectangle is: " + (length + width)*2);
        System.out.println();
    }
}
