package structural.adapter.acquiescence;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/7/22 19:42
 */
public class Client {
    public static void main(String[] args) {
        Service service = new ConcreteService();
        service.service1();
    }
}
