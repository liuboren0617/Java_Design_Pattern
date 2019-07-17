package creational.factory.abstraction;

/**
 * @author liuboren
 * @Title: 抽象工厂
 * @Description:
 * @date 2019/7/16 13:30
 */
public abstract class AbstractFactory {
    //工厂方法一
    public abstract AbstractProductA createProductA();
    //工厂方法二
    public abstract AbstractProductB createProductB();

}
