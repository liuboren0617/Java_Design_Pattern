package structural.decorator;

/**
 * @author liuboren
 * @Title: 装饰类
 * @Description: 装饰组件的抽象类,动态生成组件方法
 * @date 2019/8/4 11:42
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operation() {
        this.component.operation();
        System.out.println("装饰者类的operation()");
    }
}
