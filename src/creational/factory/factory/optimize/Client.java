package creational.factory.factory.optimize;

import com.sun.xml.internal.ws.util.xml.XmlUtil;
import creational.factory.factory.optimize.reflect.XMLUtil;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/15 15:30
 */
public class Client {
    public static void main(String[] args) {
        AbstractLoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.wirteLog();

        //测试通过反射方式生成对象
        Logger reflectLogger = (Logger) XMLUtil.getBean();
        reflectLogger.wirteLog();
    }
}
