package dp22_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本
 */
public class BillBook {


    private List<Bill> bills;

    public BillBook() {
        this.bills = new ArrayList<>();
    }


    /**
     * 添加明细的方法
     * @param bill 财务明细
     */
    public void addBill(Bill bill){
        bills.add(bill);
    }


    /**
     * 提供对外访问的方法
     * @param visitor 访问者
     */
    public void show(Visitor visitor){

        for (Bill bill : bills) {
            bill.accept(visitor);
        }
    }
}
