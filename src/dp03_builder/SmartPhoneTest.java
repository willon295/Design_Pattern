package dp03_builder;

import java.util.Date;

public class SmartPhoneTest {
    public static void main(String[] args) {
        // 可  链式调用
        SmartPhone mi6 = new SmartPhone.Builder().
                setIme(1001).
                setDate(new Date()).
                setName("MI6").
                build();

        SmartPhone vivo_nex = new SmartPhone.Builder().
                setIme(1002).
                setName("VIVO x21").
                setDate(new Date()).
                build();

        System.out.println(mi6);
        System.out.println(vivo_nex);
    }
}
