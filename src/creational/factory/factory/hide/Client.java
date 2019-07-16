package creational.factory.factory.hide;

import com.sun.xml.internal.ws.util.xml.XmlUtil;
import creational.factory.factory.optimize.Logger;
import creational.factory.factory.optimize.reflect.XMLUtil;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/15 15:30
 */
public class Client {
    public static void main(String[] args) {
        AbstractLoggerFactory abstractLoggerFactory= (AbstractLoggerFactory) XMLUtil.getBean();
        abstractLoggerFactory.wirteLog();
    }
}
