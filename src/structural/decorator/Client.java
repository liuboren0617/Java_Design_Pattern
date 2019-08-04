package structural.decorator;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/8/4 16:01
 */
public class Client {
    public static void main(String[] args) {
            Component component = new ConcreteComponent();
            Decorator decoratorA = new ConcreteDecoratorA(component);
            Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
            decoratorB.operation();
    }
}

