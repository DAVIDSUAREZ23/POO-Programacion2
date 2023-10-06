package ui;
import domain.model.Rect;
import domain.model.Shape;
import domain.model.Square;
import domain.model.Triangle;
import domain.model.Circle;
import domain.model.Ellipse;
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
            
            var s= new Square();
            s.setWidth(10);
            s.setHeight(20);

            System.out.println("Area: " + s.getArea());
            System.out.println("Perimetro: " + s.getPerimeter());

            
            /*var s= new Rect();
            s.setWidth(10);
            s.setHeight(20);

            System.out.println("Area: " + s.getArea());
            System.out.println("Perimetro: " + s.getPerimeter());


            var t = new Triangle();
            t.setSide1(10);
            t.setSide2(20);
            t.setSide3(30);

            System.out.println("Area: " + t.getArea());
            System.out.println("Perimetro: " + t.getPerimeter());

            var c= new Circle();
            c.setRadius(10);
            
            System.out.println("Area: " + c.getArea());
            System.out.println("Perimetro: " + c.getPerimeter());*/

            /*Test para los valores de los dibujos */
            var shapes= new Shape[]{
                new Rect(10,20),
                new Circle(20),
                new Square(15),
                new Ellipse(5,10),
                new Square(10)
            };

            var sumArea =0;
            
            for (Shape s : shapes){
            
                sumArea += s.getArea();
            }
            var argArea = sumArea/shapes.length;
            System.out.println("Area promedio: " + argArea);
    } 
}
