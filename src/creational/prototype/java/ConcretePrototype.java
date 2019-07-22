package creational.prototype.java;


/**
 * @author liuboren
 * @Title: 原形类的实现类
 * @Description:
 * @date 2019/7/17 13:43
 */
public class ConcretePrototype implements Prototype,Cloneable {

    private String attr;

    @Override
    public String getAttr() {
        return attr;
    }

    @Override
    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
             prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
