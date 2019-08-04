package structural.decorator;

/**
 * @author liuboren
 * @Title: 具体组件类
 * @Description:
 * @date 2019/8/4 11:41
 */
public class ConcreteComponent extends  Component{

    @Override
    void operation() {
        System.out.println("这是具体实现类");
    }
}
