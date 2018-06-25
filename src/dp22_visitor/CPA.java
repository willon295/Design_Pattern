package dp22_visitor;

/**
 * 会计
 */
public class CPA  implements Visitor{

    @Override
    public void view(IncomeBill in) {

        System.out.println("CPA: 收入: "+in.getItem()+"__"+in.getMoney());
    }

    @Override
    public void view(ConsumeBill out) {
        if (out.getItem().equals("salary")){
            System.out.println("工资支出： 这个人缴税没?");
        }
        System.out.println("CPA: 财务支出： "+out.getItem()+"__"+out.getMoney());

    }
}
