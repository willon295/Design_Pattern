package dp08_composite;

/**
 * @author willon
 * @since 18-6-20
 */
public class TestDir {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory aa = new Directory("aa");
        Directory bb = new Directory("bb");
        Directory cc = new Directory("cc");
        Directory a1 = new Directory("a1");
        Directory a2 = new Directory("a2");
        Directory b1 = new Directory("b1");
        Directory c1 = new Directory("c1");




        root.add(aa);
        root.add(bb);
        root.add(cc);



        aa.add(a1);
        aa.add(a2);


        bb.add(b1);
        cc.add(c1);



        System.out.println("|"+root.getName());

        for (Directory directory : root.getSubDirs()) {
            System.out.println("|__"+directory.getName());
            for (Directory directory1 : directory.getSubDirs()) {
                System.out.println("|_____"+directory1.getName());
            }
        }

    }
}
