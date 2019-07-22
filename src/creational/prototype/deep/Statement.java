package creational.prototype.deep;




import java.io.*;
import java.util.Date;

/**
 * @author liuboren
 * @Title: 报表类
 * @Description:
 * @date 2019/7/17 14:38
 */
public class Statement implements Serializable {
    private String name;
    private Date date;
    private Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /*深克隆*/
    public Statement deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (Statement) ois.readObject();
    }
}
