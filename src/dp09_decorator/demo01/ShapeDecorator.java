package dp09_decorator.demo01;

/**
 * 抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {

    //需要被装饰的形状, 注意使用 protected 修饰
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 直接委派为已经装饰过的对象
     */
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
