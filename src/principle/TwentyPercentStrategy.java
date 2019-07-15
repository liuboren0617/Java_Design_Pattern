package principle;

/**
 * @author liuboren
 * @Title: 满200打八折实现类
 * @Description: 具体的打折实现
 * @date 2019/7/11 14:39
 */
public class TwentyPercentStrategy implements DiscountStrategyInterface{

    /*
    * 消费超过200,打八折
    * */
    @Override
    public Double strategy(Double money){
        if(money > 200){
            money = money * 0.8;
        }
        return money;
    }
}
