package structural.facade;

/**
 * @author liuboren
 * @Title: 外观类
 * @Description:
 * @date 2019/8/4 17:39
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void method(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
