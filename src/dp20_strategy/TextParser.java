package dp20_strategy;

/**
 * 普通解析
 */
public class TextParser implements Parser{
    @Override
    public String parse(String msg) {
        System.out.println(msg);
        return msg;
    }
}
