package structural.composite;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/30 19:21
 */
public class Client {

    public static void main(String[] args) {
        Component grandfather = new Composite();
        Component father = new Composite();
        Component son = new Leaf();
        Component son2 = new Composite();
        Component grandson = new Leaf();

        grandfather.add(father);
        father.add(son);
        father.add(son2);
        son2.add(grandson);

        grandfather.operation();

    }
}
