package creational.prototype.shallow;




import java.util.Date;

/**
 * @author liuboren
 * @Title: 报表类
 * @Description:
 * @date 2019/7/17 14:38
 */
public class Statement implements Cloneable {
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

    @Override
    public Statement clone(){
        Statement clone = null;
        try {
            clone = (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
