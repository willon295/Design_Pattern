package dp22_visitor;

public class Main {

    public static void main(String[] args) {
        BillBook book = new BillBook();


       book.addBill( new IncomeBill("卖产品",10000));
       book.addBill(new IncomeBill("卖广告位",20000));
       book.addBill(new ConsumeBill("salary",5000));
       book.addBill(new ConsumeBill("材料",13000));


        Boss boss = new Boss();
        CPA cpa = new CPA();

        book.show(boss); //老板看
        book.show(cpa); // 会计看

        double totalConsume = boss.getTotalConsume();
        double totalIncome = boss.getTotalIncome();
        System.out.println("Boss: 收入 "+totalIncome+"_支出 "+totalConsume);

    }

}
/*
CPA: 收入: 卖产品__10000.0
CPA: 收入: 卖广告位__20000.0
工资支出： 这个人缴税没?
CPA: 财务支出： salary__5000.0
CPA: 财务支出： 材料__13000.0
Boss: 收入 30000.0_支出 18000.0

 */