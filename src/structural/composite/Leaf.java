package structural.composite;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/7/30 19:16
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("执行叶子的操作");
    }

    @Override
    public void add(Component component) {
        System.out.println("叶子没有add()方法");
    }

    @Override
    public void remove(Component component) {
        System.out.println("叶子没有remove方法");
    }

    @Override
    public void getChild(int i) {
        System.out.println("叶子没有getChild()方法");
    }
}
