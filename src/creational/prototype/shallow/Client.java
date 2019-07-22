package creational.prototype.shallow;

/**
 * @author liuboren
 * @Title: 客户端
 * @Description:
 * @date 2019/7/17 14:58
 */
public class Client {
    public static void main(String[] args) {
        Statement statement = new Statement();
        statement.setAttachment(new Attachment());
        Statement statementClone = statement.clone();
        System.out.println("报表是否相同? "+(statement == statementClone));
        System.out.println("附件是否相同? " + (statement.getAttachment() == statementClone.getAttachment()));
    }
}
