package structural.adapter.bothway;

/**
 * @author liuboren
 * @Title: 具体Target类
 * @Description:
 * @date 2019/7/22 19:25
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("target的实现方式");
    }
}
