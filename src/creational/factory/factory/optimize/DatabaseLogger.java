package creational.factory.factory.optimize;

/**
 * @author liuboren
 * @Title: 数据库日志类
 * @Description:
 * @date 2019/7/15 15:05
 */
public class DatabaseLogger implements Logger {


    @Override
    public void wirteLog() {
        System.out.println("数据库日志记录日志..");
    }
}
