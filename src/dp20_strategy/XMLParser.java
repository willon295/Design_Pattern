package dp20_strategy;

/**
 * XML 解析
 */
public class XMLParser implements Parser {
    @Override
    public String parse(String msg) {
        System.out.println("XML__"+msg);
        return "XML_"+msg;
    }
}
