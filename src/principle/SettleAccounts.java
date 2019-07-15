package principle;

/**
 * @author liuboren
 * @Title:结账功能
 * @Description: 使用打折策略结账
 * @date 2019/7/11 14:37
 */
public class SettleAccounts {

    public Double Buy(Double money,DiscountStrategyInterface strategy){
        //返回打折后的金额
        return strategy.strategy(money);
    }

    public static void main(String[] args) {
        SettleAccounts settleAccounts = new SettleAccounts();
        /*
        * 这样很灵活,有新的打折策略的时候,只需要添加新的实现类,
        * 并传入购买方法,开闭原则得到了很好的实现
        * */
        settleAccounts.Buy(300d,new TwentyPercentStrategy());
    }


}
