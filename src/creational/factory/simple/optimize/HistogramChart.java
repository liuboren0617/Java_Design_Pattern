package creational.factory.simple.optimize;

/**
 * @author liuboren
 * @Title: 柱状图
 * @Description:
 * @date 2019/7/15 9:44
 */
public class HistogramChart implements Chart{
    public HistogramChart() {
        System.out.println("创建了柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示了柱状图");
    }
}
