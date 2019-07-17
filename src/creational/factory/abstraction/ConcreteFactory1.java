package creational.factory.abstraction;

/**
 * @author liuboren
 * @Title: 具体工厂类
 * @Description:
 * @date 2019/7/16 13:32
 */
public class ConcreteFactory1 extends  AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
