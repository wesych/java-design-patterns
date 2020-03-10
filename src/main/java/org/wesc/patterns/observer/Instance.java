package org.wesc.patterns.observer;

public class Instance {

    /**
     * 观察者模式测试
     * @param args
     */
    public static void main(String[] args) {
        // 创建主题
        Subject subject = new Subject();

        // 创建订阅者A/B/C
        Observer ob1 = new Observer("A");
        Observer ob2 = new Observer("B");
        Observer ob3 = new Observer("C");

        // 订阅者订阅主题
        subject.attach(ob1);
        subject.attach(ob2);
        subject.attach(ob3);

        // 主题更新消息
        subject.notifyAllObservers("2020-02-01开始在家远程办公，直至疫情结束！");

        // B取消订阅
        subject.detach(ob2);

        // 主题更新消息
        subject.notifyAllObservers("疫情已结结束，恢复现场办公，2020-03-18");
    }
}
