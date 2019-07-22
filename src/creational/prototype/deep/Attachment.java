package creational.prototype.deep;

import java.io.Serializable;

/**
 * @author liuboren
 * @Title: 附件类
 * @Description:
 * @date 2019/7/17 14:39
 */
public class Attachment implements Serializable {
    private String name;
    private String content;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
