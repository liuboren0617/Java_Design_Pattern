package structural.adapter.bothway;

/**
 * @author liuboren
 * @Title: 适配器类
 * @Description:
 * @date 2019/7/22 19:26
 */
public class Adapter implements Target,Adaptee {
    private Target target;

    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
