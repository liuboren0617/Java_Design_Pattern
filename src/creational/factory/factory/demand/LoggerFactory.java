package creational.factory.factory.demand;

import creational.factory.factory.optimize.DatabaseLogger;
import creational.factory.factory.optimize.FileLogger;
import creational.factory.factory.optimize.Logger;

/**
 * @author liuboren
 * @Title: 日志工厂
 * @Description: 使用简单工厂方法模式解决需求
 * @date 2019/7/15 15:02
 */
public class LoggerFactory {

    //静态工厂方法
    public static Logger createLogger(String args){
        Logger logger;
        if("db".equalsIgnoreCase(args)){
            logger = new DatabaseLogger();
        }else if("file".equalsIgnoreCase(args)){
            logger = new FileLogger();
        }else{
            logger = null;
        }
        return logger;
    }

}
