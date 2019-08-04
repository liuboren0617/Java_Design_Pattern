package structural.adapter.bothway;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/7/22 19:28
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ConcreteTarget());
        adapter.specificRequest();

        Adapter adapter1 =  new Adapter(new ConcreteAdaptee());
        adapter1.request();

    }
}
