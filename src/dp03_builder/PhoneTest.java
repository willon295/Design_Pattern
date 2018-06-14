package dp03_builder;

public class PhoneTest {
    public static void main(String[] args) {

        Director director = new Director();
        Phone mi4 = director.getMi4();
        Phone vivox21 = director.getVIVOX21();
        System.out.println(mi4);
        System.out.println(vivox21);

    }
}
