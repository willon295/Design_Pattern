package dp22_visitor;

/**
 * 访问者
 */
public interface Visitor {

    //查看收入
    void view(IncomeBill in);

    //查看支出
    void view(ConsumeBill out);
}
