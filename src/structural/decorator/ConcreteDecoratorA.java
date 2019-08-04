package structural.decorator;

/**
 * @author liuboren
 * @Title: 具体装饰者类
 * @Description:
 * @date 2019/8/4 11:43
 */
public class ConcreteDecoratorA extends Decorator {


    private Integer addState = 0;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        addState++;
        System.out.println("addState = " + addState);

    }


}
