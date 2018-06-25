package dp22_visitor;

/**
 * 收入
 */
public class IncomeBill  implements Bill{

    private String  item;
    private double money;


    public IncomeBill(String item, double money) {
        this.item = item;
        this.money = money;
    }

    /**
     * 让访问者访问
     * @param visitor 访问者
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.view(this);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
