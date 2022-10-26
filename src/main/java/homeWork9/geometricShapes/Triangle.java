package homeWork9.geometricShapes;

import homeWork9.FigureImpl;

public class Triangle implements FigureImpl {

    double sideFirstLength;
    double sideSecondLength;
    double sideThirdLength;

    public Triangle(double sideFirstLength, double sideSecondLength, double sideThirdLength) {
        this.sideFirstLength = sideFirstLength;
        this.sideSecondLength = sideSecondLength;
        this.sideThirdLength = sideThirdLength;
    }

    @Override
    public double area() {
        return sideFirstLength * sideSecondLength * sideThirdLength;
    }

}
