package structural.composite;

/**
 * @author liuboren
 * @Title: 抽象构建
 * @Description:
 * @date 2019/7/30 19:15
 */
public interface Component {


    void operation();

    void add(Component component);

    void remove(Component component);

    void getChild(int i );
}
