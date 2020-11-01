package com.mpoom.designpattern.creational.prototype.deepclone;


/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/11/1
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog previewLog = new WeeklyLog();
        Attachment attachment = new Attachment();

        previewLog.setAttachment(attachment);
        WeeklyLog newLog = previewLog.deepClone();

        System.out.println("周报是否相同：" + previewLog.equals(newLog));
        System.out.println("附件是否相同:" + previewLog.getAttachment().equals(newLog.getAttachment()));
    }
}
