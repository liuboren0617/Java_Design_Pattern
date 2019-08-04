package structural.decorator;

/**
 * @author liuboren
 * @Title: 具体装饰者类
 * @Description:
 * @date 2019/8/4 15:58
 */
public class ConcreteDecoratorB extends Decorator {


    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        addBehavior();
    }

    public void addBehavior(){
        System.out.println("这是ConcreteDecoratorB 的addBehavior方法");
    }

}
