package dp03_builder;

public abstract class PhoneBuilder {

    abstract PhoneBuilder setName(String name);

    abstract PhoneBuilder setId(int id);

    abstract PhoneBuilder setFunction(String  fuc);

    abstract Phone build();
}
