package dp22_visitor;

/**
 * 支出
 */
public class ConsumeBill implements Bill {

    //收入条目
    private String item;

    //金额
    private double money;

    public ConsumeBill(String item, double money) {
        this.item = item;
        this.money = money;
    }

    /**
     * 让查看者访问
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
