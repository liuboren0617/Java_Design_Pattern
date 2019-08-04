package structural.adapter.object;

/**
 * @author liuboren
 * @Title: 适配器类
 * @Description:
 * @date 2019/7/22 19:03
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }

}
