package dp19_nullObject;

/**
 * UTF8类
 */
public class EncUTF8  extends AbstractEncType {


    public EncUTF8(String name) {
        this.name=name;
    }

    @Override
    boolean isNil() {
        return false;
    }

    @Override
    String getName() {
        return "UTF8";
    }
}
