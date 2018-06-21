package dp09_decorator.demo01;

/**
 * @author willon
 * @since 18-6-21
 */
public class TestDecorator {
    public static void main(String[] args) {

        Shape   redCircle  = new ColorDecrator(new Circle());
        redCircle.draw();

        System.out.println();

        Shape  rec = new BorderDecorator(new Rectangle());
        rec.draw();


        /*
        Shape: Circle
        Color: Red

        Shape: Rectangle
        Border: Dash
        */
    }
}
