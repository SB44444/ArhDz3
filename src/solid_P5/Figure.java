package solid_P5;

public class Figure extends Data {
    private Figure point;

    public Figure(Figure point) {
        this.point = point;
    }

    public Figure getFigure() {
        return point;
    }
}
