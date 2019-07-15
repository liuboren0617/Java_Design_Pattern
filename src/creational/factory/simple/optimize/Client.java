package creational.factory.simple.optimize;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/7/15 9:51
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
