package creational.factory.simple.optimize;

/**
 * @author liuboren
 * @Title: 折线图
 * @Description:
 * @date 2019/7/15 9:47
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建了折线图");
    }

    @Override
    public void display() {
        System.out.println("显示了折线图");
    }
}
