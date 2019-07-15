package principle;

/**
 * @author liuboren
 * @Title: 打折接口
 * @Description: 声明打折方法,具体有实现类去实现
 * @date 2019/7/11 14:48
 */
public interface DiscountStrategyInterface {

    //打折策略
    Double strategy(Double money);
}
