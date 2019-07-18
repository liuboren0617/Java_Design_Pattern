package creational.singleton;

/**
 * @author liuboren
 * @Title: 完美版 懒加载单例类
 * @Description:
 * @date 2019/7/16 16:47
 */
public class LazySingletonPerfect {
    private volatile static LazySingletonPerfect instance = null;

    private LazySingletonPerfect() {
    }

    public static LazySingletonPerfect getInstance() {
            //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
            //第二重判断
                if (instance == null) {
                    instance = new LazySingletonPerfect(); //创建单例实例
                }
            }
        }
        return instance;
    }

}
