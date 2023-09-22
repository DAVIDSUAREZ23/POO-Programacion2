package domain.ui;
import domain.model.Rect;
import domain.model.Shape;
import domain.model.Square;
public class Test {

    public static void main(String[] args) {
        /*var shape1 = new Shape(-200,10);
        var shape2= new Shape(20,1500);

            shape1.y = -500;
            shape1.setX(-200);

            System.out.println(shape1.getX());
            System.out.println("Ins #1 x= "+ shape1.x + "y =" + shape1.y);
            */

            
            /*var square = new Square();*/

            var rect = new Rect();

            rect.setX(50);
            /*square.setX(50);
            square.setWidth(65);
            */

            /*
            System.out.println("Square: " + square.getWidth());
            System.out.println("Square: " + square.getX());
            */

            rect.setWidth(65);

            System.out.println("Rectangle Width: " + rect.getWidth());
            System.out.println("Rectangle Height:" + rect.getHeight());

            rect.setHeight(21);

            System.out.println("Rectangle Width: " + rect.getWidth());
            System.out.println("Rectangle Height:" + rect.getHeight());




    } 
}
