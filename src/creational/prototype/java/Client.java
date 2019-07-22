package creational.prototype.java;


/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/7/17 13:48
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr("Prototype");
        Prototype prototypeClone = prototype.clone();
        System.out.println(prototype == prototypeClone);

    }
}
