package creational.factory.factory.hide;


/**
 * @author liuboren
 * @Title: 文件日志工厂
 * @Description: 创建文件工厂类
 * @date 2019/7/15 15:23
 */
public class FileLoggerFactory extends AbstractLoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
