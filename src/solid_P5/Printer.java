package solid_P5;

public class Printer  extends Data{

    public void print(Text text) {
        System.out.println(text.getText());
    }
    public void print(Figure point) {
        System.out.println(point.getFigure());
    }
}