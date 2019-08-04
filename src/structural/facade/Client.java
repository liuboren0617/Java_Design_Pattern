package structural.facade;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/8/4 17:40
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
