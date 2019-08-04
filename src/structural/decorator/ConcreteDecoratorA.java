package structural.decorator;

/**
 * @author liuboren
 * @Title: 具体装饰者类
 * @Description:
 * @date 2019/8/4 11:43
 */
public class ConcreteDecoratorA extends Decorator {

    private Component component;

    private Integer addState = 0;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void operation(){
        this.component.operation();
        addState++;
        System.out.println("addState = " + addState);

    }


}
