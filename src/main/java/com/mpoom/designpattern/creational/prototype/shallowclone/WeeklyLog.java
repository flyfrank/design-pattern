package com.mpoom.designpattern.creational.prototype.shallowclone;

import java.util.Date;

/**
 * @description 周报
 * @author: Yaoke.Hu
 * @date: 2020/11/1
 */
public class WeeklyLog implements Cloneable {
    private String name;
    private Date Date;
    private String content;
    private Attachment attachment;

    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            e.printStackTrace();
        }
        return (WeeklyLog) obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
