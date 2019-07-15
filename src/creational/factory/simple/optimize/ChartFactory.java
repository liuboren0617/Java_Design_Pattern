package creational.factory.simple.optimize;

/**
 * @author liuboren
 * @Title: 简单工厂类
 * @Description:
 * @date 2019/7/15 9:48
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
