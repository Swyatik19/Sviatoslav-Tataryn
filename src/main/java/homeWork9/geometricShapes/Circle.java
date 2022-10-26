package homeWork9.geometricShapes;

import homeWork9.FigureImpl;

public class Circle implements FigureImpl {
    double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double area() {
        return Math.PI * radiusCircle * radiusCircle;
    }
}
