package structural.bridge;

/**
 * @author liuboren
 * @Title: 抽象类
 * @Description:
 * @date 2019/7/22 20:33
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        //实现操作方法
        implementor.operationImpl();

        //其他的业务代码..
        System.out.println("其他的业务代码");
    }
}
