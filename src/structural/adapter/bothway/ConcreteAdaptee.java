package structural.adapter.bothway;

/**
 * @author liuboren
 * @Title: 具体适配者类
 * @Description:
 * @date 2019/7/22 19:26
 */
public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("具体适配者实现");
    }
}
