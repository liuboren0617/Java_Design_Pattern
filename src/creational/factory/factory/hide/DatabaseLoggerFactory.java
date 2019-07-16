package creational.factory.factory.hide;

/**
 * @author liuboren
 * @Title: 数据库日志工厂方法
 * @Description: 创建数据库日志类
 * @date 2019/7/15 15:26
 */
public class DatabaseLoggerFactory extends AbstractLoggerFactory {
    @Override
    public Logger createLogger() {
        //省略连接数据库代码、初始化数据库代码
        return new DatabaseLogger();
    }
}
