package structural.adapter.classes;


/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/22 19:04
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
