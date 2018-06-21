package dp09_decorator.demo01;

/**
 * 具体的修饰类，修改颜色
 */
public class ColorDecrator extends ShapeDecorator{
    public ColorDecrator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        //进行功能装饰
        setColor2Red(decoratedShape);

    }

    /**
     * 增前的功能
     * @param decoratedShape 需要修饰的对象
     */
    public void setColor2Red(Shape decoratedShape){
        System.out.println("Color: Red");
    }

}
