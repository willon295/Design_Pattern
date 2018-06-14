package dp03_builder;

public class Director {

    //喊一个码农过来做产品
    private PhoneBuilder builder = new ConcretePhoneBuilder();

    //告诉码农，我需要Mi4这个产品
    public Phone getMi4() {
        return builder.setName("Mi").setId(4).setFunction("Play Games").build();
    }

    //再告诉码农，我要Vivo X21这个产品
    public Phone getVIVOX21(){
        return builder.setId(2).setName("VIVO X21").setFunction("so many").build();
    }
}
