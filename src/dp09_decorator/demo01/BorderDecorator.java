package dp09_decorator.demo01;

/**
 * 边框修饰类
 */
public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    //对原有的功能进行增强
    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder2Dash(decoratedShape);
    }


    //增强的功能
    public void setBorder2Dash(Shape decoratedShape){
        System.out.println("Border: Dash");
    }


}
