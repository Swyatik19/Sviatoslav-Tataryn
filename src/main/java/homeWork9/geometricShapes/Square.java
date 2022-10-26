package homeWork9.geometricShapes;

import homeWork9.FigureImpl;

public class Square implements FigureImpl {
    double sideFirstLength;
    double sideSecondLength;

    public Square(double sideFirstLength, double sideSecondLength) {
        this.sideFirstLength = sideFirstLength;
        this.sideSecondLength = sideSecondLength;
    }

    @Override
    public double area() {
        return sideFirstLength * sideSecondLength;
    }

}
