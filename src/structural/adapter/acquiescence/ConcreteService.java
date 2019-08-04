package structural.adapter.acquiescence;

/**
 * @author liuboren
 * @Title: 具体服务类
 * @Description: 实现需要的接口
 * @date 2019/7/22 19:41
 */
public class ConcreteService extends AbstractService {

    @Override
    public void service1() {
        System.out.println("需要的方法");
    }

}
