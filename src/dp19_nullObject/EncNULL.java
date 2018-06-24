package dp19_nullObject;


/**
 * 自定义空类型
 */
public class EncNULL extends AbstractEncType {
    @Override
    boolean isNil() {
        return true;
    }
    @Override
    String getName() {
        return "Not available ";
    }
}
