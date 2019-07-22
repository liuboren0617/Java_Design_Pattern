package creational.prototype;

/**
 * @author liuboren
 * @Title: 原形接口类
 * @Description:
 * @date 2019/7/17 13:41
 */
public interface Prototype {
    void setAttr(String attr);

    String getAttr();

    Prototype clone();
}
