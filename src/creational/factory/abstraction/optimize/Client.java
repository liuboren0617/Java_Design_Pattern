package creational.factory.abstraction.optimize;

/**
 * @author liuboren
 * @Title: 客户端类
 * @Description:
 * @date 2019/7/16 13:48
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = new SummerSkinFactory();
        Button button = skinFactory.createButton();
        ComboBox comboBox = skinFactory.createComboBox();
        TextField textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}

/*
* 按钮接口
* */
interface Button {
     void display();
}
//Spring按钮类：具体产品
class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}

//Summer按钮类：具体产品
class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
//文本框接口：抽象产品
interface TextField {
     void display();
}
//Spring文本框类：具体产品
class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
//Summer文本框类：具体产品
class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
//组合框接口：抽象产品
interface ComboBox {
    public void display();
}
//Spring组合框类：具体产品
class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
//Summer组合框类：具体产品
class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
//界面皮肤工厂接口：抽象工厂
interface SkinFactory {
     Button createButton();
     TextField createTextField();
     ComboBox createComboBox();
}
//Spring皮肤工厂：具体工厂
class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }
    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
//Summer皮肤工厂：具体工厂
class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }
    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
