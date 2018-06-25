package dp22_visitor;

/**
 * Boss
 */
public class Boss implements Visitor {


    //只看总收入、支出
    private double totalIncome;
    private double totalConsume;


    @Override
    public void view(IncomeBill in) {

        totalIncome += in.getMoney();
    }

    @Override
    public void view(ConsumeBill out) {

        totalConsume += out.getMoney();
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalConsume() {
        return totalConsume;
    }


}
