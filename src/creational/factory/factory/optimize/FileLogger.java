package creational.factory.factory.optimize;


/**
 * @author liuboren
 * @Title: 文件日志类
 * @Description:
 * @date 2019/7/15 15:06
 */
public class FileLogger implements Logger {



    @Override
    public void wirteLog() {
        System.out.println("文件日志记录日志..");
    }
}
