package basic;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/7/10 9:41
 */
public abstract class AbstractDog implements Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cry(){
        System.out.println("狗,汪汪叫");
    }
}
