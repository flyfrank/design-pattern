package com.mpoom.designpattern.behavioral.command.example1;
/**
 * @description: 命令模式——应用案例1
 * Sunny软件公司开发人员为公司内部OA系统开发了一个桌面版应用程序,该应用程序为用户
 * 提供了一系列自定义功能键,用户可以通过这些功能键来实现一些快捷操作。Sunny软件公司
 * 开发人员通过分析,发现不同的用户可能会有不同的使用习惯,在设置功能键的时候每个人
 * 都有自己的喜好,例如有的人喜欢将第一个功能键设置为“打开帮助文档”,有的人则喜欢将该
 * 功能键设置为“最小化至托盘”,为了让用户能够灵活地进行功能键的设置,开发人员提供了一
 * 个“功能键设置”窗口。
 *
 * 用户可以将功能键和相应功能绑定在一起,还可以根据需要来修改功能
 * 键的设置,而且系统在未来可能还会增加一些新的功能或功能键。
 * Sunny软件公司某开发人员欲使用如下代码来实现功能键与功能处理类之间的调用关系:
 * //FunctionButton:功能键类,请求发送者
 * class FunctionButton {
 * private HelpHandler help; //HelpHandler:帮助文档处理类,请求接收者
 * //在FunctionButton的onClick()方法中调用HelpHandler的display()方法
 * public void onClick() {
 * help = new HelpHandler();
 * help.display(); //显示帮助文档
 * }
 * }
 * 在上述代码中,功能键类FunctionButton充当请求的发送者,帮助文档处理类HelpHandler充当
 * 请求的接收者,在发送者FunctionButton的onClick()方法中将调用接收者HelpHandler的display()
 * 方法。显然,如果使用上述代码,将给系统带来如下几个问题:
 * (1) 由于请求发送者和请求接收者之间存在方法的直接调用,耦合度很高,更换请求接收者必
 * 须修改发送者的源代码,如果需要将请求接收者HelpHandler改为WindowHanlder(窗口处理
 * 类),则需要修改FunctionButton的源代码,违背了“开闭原则”。
 * (2) FunctionButton类在设计和实现时功能已被固定,如果增加一个新的请求接收者,如果不修
 * 改原有的FunctionButton类,则必须增加一个新的与FunctionButton功能类似的类,这将导致系
 * 263请求发送者与接收者解耦——命令模式(一)
 * 统中类的个数急剧增加。由于请求接收者HelpHandler、WindowHanlder等类之间可能不存在任
 * 何关系,它们没有共同的抽象层,因此也很难依据“依赖倒转原则”来设计FunctionButton。
 * (3) 用户无法按照自己的需要来设置某个功能键的功能,一个功能键类的功能一旦固定,在不
 * 修改源代码的情况下无法更换其功能,系统缺乏灵活性。
 *
 *
 * 为了降低功能键与功能处理类之间的耦合度,让用户可以自定义每一个功能键的功能,Sunny
 * 软件公司开发人员使用命令模式来设计“自定义功能键”模块。
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */