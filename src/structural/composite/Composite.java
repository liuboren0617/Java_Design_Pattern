package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboren
 * @Title: 组合类
 * @Description:
 * @date 2019/7/30 19:17
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("调用了Composite方法");

        /*由于容器构件中仍然可以包含容器构件，因此在对容器构件进行处
          理时需要使用递归算法，即在容器构件的operation()方法中递归调用其成员构件的operation()方
          法*/
        for (Component child : children){
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void getChild(int i) {
        children.get(i);
    }
}
