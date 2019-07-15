package creational.factory.simple.optimize;

/**
 * @author liuboren
 * @Title: 饼状图
 * @Description:
 * @date 2019/7/15 9:45
 */
public class PieChart implements Chart{

    public PieChart() {
        System.out.println("创建了饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示了饼状图");
    }
}
