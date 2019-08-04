package structural.bridge;

/**
 * @author liuboren
 * @Title: 抽象类的实现类
 * @Description:
 * @date 2019/7/22 20:35
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation(){
        //具体的实现方法
        implementor.operationImpl();

        System.out.println("RefinedAbstraction的一些其他的业务实现方法");

    }
}
