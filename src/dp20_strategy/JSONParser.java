package dp20_strategy;

/**
 * JSON 解析
 */
public class JSONParser implements Parser {
    @Override
    public String parse(String msg) {
        System.out.println("JSON_"+msg);
        return "JSON_"+msg;
    }
}
