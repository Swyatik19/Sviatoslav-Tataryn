package homeWork9;

import homeWork9.geometricShapes.Circle;
import homeWork9.geometricShapes.Square;
import homeWork9.geometricShapes.Triangle;

public class Main {

    public static void main(String[] args) {
        FigureImpl[] figures = {
                new Triangle(2, 3, 4)
                , new Square(3, 4)
                , new Circle(5)
        };


        sumArea(figures);
    }

    public static void sumArea(FigureImpl[] figures) {
        var sum = 0;
        for (FigureImpl o : figures) {
            sum += o.area();
        }
        System.out.println(sum);
    }


}
