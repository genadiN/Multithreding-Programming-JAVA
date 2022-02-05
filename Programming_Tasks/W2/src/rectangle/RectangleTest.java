package rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1.3242 , 2.436);
        System.out.println(rectangle1);
        rectangle1.setWidth(3);
        rectangle1.setHeight(4);

        System.out.printf("Area %.3f , Perimeter: %.3f\n" , rectangle1.getArea() , rectangle1.getPerimeter());
    }
}
