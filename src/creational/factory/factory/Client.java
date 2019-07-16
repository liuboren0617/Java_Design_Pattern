package creational.factory.factory;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description: 实际调工厂方法
 * @date 2019/7/15 14:28
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();

    }
}
