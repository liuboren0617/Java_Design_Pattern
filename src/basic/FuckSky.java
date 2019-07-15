package basic;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/7/10 9:42
 */
public class FuckSky extends AbstractDog {



    @Override
    public void cry() {
        System.out.println("FuckSky,汪汪叫");
    }

    public static void main(String[] args) {
        AbstractDog fuckSky = new FuckSky();
        fuckSky.setName("旺财");
        System.out.println("fuckSky.getName() = " + fuckSky.getName());
        fuckSky.cry();
    }
}
