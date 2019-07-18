package creational.singleton;

/**
 * @author liuboren
 * @Title: 饿汉式1单例
 * @Description:
 * @date 2019/7/16 16:30
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }
    public static EagerSingleton getInstance() {
        return instance;
    }
}
