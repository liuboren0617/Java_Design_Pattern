package creational.factory.simple;

/**
 * @author liuboren
 * @Title: 产品抽象类
 * @Description: 抽离公共方法和抽象业务方法
 * @date 2019/7/12 16:38
 */
public abstract class AbstractProduct {
    //所有产品类的公共业务方法
    public void methodSame(){
        // 公共方法的实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}

class  ConcreteProductA extends AbstractProduct{

    @Override
    public void methodDiff() {
        //业务方法的实现
    }
}

class  ConcreteProductB extends AbstractProduct{

    @Override
    public void methodDiff() {
        //业务方法的实现
    }
}


class Factory{
    public static AbstractProduct getProduct(String arg){
        AbstractProduct product = null;
        if(arg.equalsIgnoreCase("A")){
            product = new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")){
            product = new ConcreteProductB();
        }
        return product;
    }
}

class Client{
    public static void main(String[] args) {
        AbstractProduct product;
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();

    }
}