package com.mpoom.designpattern.creational.prototype.shallowclone;
/**
 * @description 浅克隆
 * @author: Yaoke.Hu
 * @date: 2020/11/1
 *
 * 在浅克隆中,如果原型对象的成员变量是值类型,将复制一份给克隆对象;如果原型对象的
 * 成员变量是引用类型,则将引用对象的地址复制一份给克隆对象,也就是说原型对象和克隆
 * 对象的成员变量指向相同的内存地址。简单来说,在浅克隆中,当对象被复制时只复制它本
 * 身和其中包含的值类型的成员变量,而引用类型的成员对象并没有复制。
 *
 */