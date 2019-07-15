package creational.factory.simple;

/**
 * @author liuboren
 * @Title: 图标类
 * @Description: 根据不同的参数,创建不同的图表
 * @date 2019/7/12 14:31
 */
public class Chart {

    private String type;

    public Chart(Object[][] obj,String type) {
        this.type = type;
        if(type.equalsIgnoreCase("histogram")){
            //初始化柱状图
        }else if(type.equalsIgnoreCase("pie")){
            //初始化柱状图
        }else if(type.equalsIgnoreCase("line")){
            //初始化折线图
        }
    }

    public void display(){
        if(this.type.equalsIgnoreCase("histogram")){
            // 显示柱状图
        }else if(this.type.equalsIgnoreCase("pie")){
            //显示饼状图
        }else if(this.type.equalsIgnoreCase("Line")){
            //显示折线图
        }
    }


}
