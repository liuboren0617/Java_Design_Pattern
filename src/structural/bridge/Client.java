package structural.bridge;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/22 20:38
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementor());
        abstraction.operation();
    }
}
