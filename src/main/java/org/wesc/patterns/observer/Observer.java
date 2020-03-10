package org.wesc.patterns.observer;

/**
 * 观察者
 */
public class Observer extends AbstractObserver {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(String receivedMessage) {
        System.out.println(name + " 收到推送消息： " + receivedMessage);
    }

}
