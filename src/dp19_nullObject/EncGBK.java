package dp19_nullObject;

/**
 * GBK类
 */
public class EncGBK  extends AbstractEncType {

    public EncGBK(String name) {
        this.name=name;
    }

    @Override
    boolean isNil() {
        return false;
    }

    @Override
    String getName() {
        return "GBK";
    }
}
