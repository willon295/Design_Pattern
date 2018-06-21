package dp09_decorator.demo02;

/**
 * @author willon
 * @since 18-6-21
 */
public class TestDecorator2 {
    public static void main(String[] args) {


        Beverage mikeTea = new MikeTea();
        mikeTea = new Pearl(mikeTea);
        mikeTea= new Mung(mikeTea);
        System.out.println(mikeTea.getName()+"---"+mikeTea.price());



        Beverage mung = new Mung((new MikeShake()));
        System.out.println(mung.getName()+"---"+mung.price());



    }
}
