package creational.singleton;

/**
 * @author liuboren
 * @Title: IoDh技术
 * @Description: Java最好的单例实现模式
 * @date 2019/7/17 10:25
 */
public class IoDHSingleton {

    private IoDHSingleton() {
    }

    //静态内部类的成员变量才能是静态的
    private static class HolderClas{

        public static IoDHSingleton ioDHSingleton = new IoDHSingleton();
    }

    public static  IoDHSingleton getInstance(){
        return HolderClas.ioDHSingleton;
    }

    public static void main(String[] args) {
        IoDHSingleton s1,s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);

    }
}
