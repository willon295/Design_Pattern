package dp19_nullObject;


import java.util.Objects;

public class EncTypeFactory {

    private static final String UTF8 = "UTF8";
    private static final String GBK = "GBK";

    public static AbstractEncType get(String name) {
        if (Objects.equals(name, UTF8)) {
            return new EncUTF8(UTF8);
        } else if (Objects.equals(name, GBK)) {
            return new EncGBK(GBK);
        }

        return new EncNULL();

    }
}
