package creational.factory.factory.hide;


/**
 * @author liuboren
 * @Title: 抽象工厂类
 * @Description:
 * @date 2019/7/15 15:21
 */
public abstract class AbstractLoggerFactory {
    public abstract Logger createLogger();

    public void wirteLog(){
        Logger logger = this.createLogger();
        logger.wirteLog();
    }
}
