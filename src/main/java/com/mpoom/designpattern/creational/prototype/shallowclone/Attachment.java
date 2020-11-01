package com.mpoom.designpattern.creational.prototype.shallowclone;

/**
 * @description 附件
 * @author: Yaoke.Hu
 * @date: 2020/11/1
 */
public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，名称："  + name);
    }
}
