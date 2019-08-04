package structural.adapter.classes;


/**
 * @author liuboren
 * @Title: 适配器类
 * @Description:
 * @date 2019/7/22 19:03
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request(){
        this.specificRequest();
    }

}
