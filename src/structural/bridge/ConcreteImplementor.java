package structural.bridge;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/7/22 20:37
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体的Implementor方法");
    }
}
