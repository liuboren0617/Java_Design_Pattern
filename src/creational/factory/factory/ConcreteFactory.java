package creational.factory.factory;

/**
 * @author liuboren
 * @Title: 具体工厂
 * @Description: 根据需要创建具体的产品类
 * @date 2019/7/15 14:21
 */
public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
