package structural.composite.optimize;

/**
 * @author liuboren
 * @Title: 抽象构建
 * @Description:
 * @date 2019/7/30 19:15
 */
public interface Component {


    void operation();

    default void add(Component component){
        System.out.println("不支持该方法");
    }

    default void remove(Component component){
        System.out.println("不支持该方法");
    }

    default void getChild(int i){
        System.out.println("不支持该方法");
    }
}
