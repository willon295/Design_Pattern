package dp22_visitor;

/**
 * Element 接口
 */
public interface Bill {
    //接收一个访问者
    void accept(Visitor visitor);
}
