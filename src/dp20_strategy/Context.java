package dp20_strategy;

/**
 * 具体环境类
 */
public class Context {

    private Parser parser;

    public Context(Parser parser) {
        this.parser = parser;
    }

    /**
     * 需要执行策略方法，根据不同的环境执行不同的策略
     * @param msg 信息
     * @return 解析之后的信息
     */
    public String parse(String msg) {
        return parser.parse(msg);
    }
}
