package creational.singleton;

/**
 * @author liuboren
 * @Title: 单例版任务管理器类
 * @Description:
 * @date 2019/7/16 15:24
 */
public class TaskManagerSingleton {
    private static TaskManagerSingleton taskManagerSingleton = null;

    //初始化窗口
    private TaskManagerSingleton() {
    }

    public static TaskManagerSingleton getInstance(){
        if (taskManagerSingleton == null){
            taskManagerSingleton = new TaskManagerSingleton();
        }
        return taskManagerSingleton;
    }

    //显示进程
    public void displayProcesses() {

    }

    //显示服务
    public void displayServices() {

    }
}
