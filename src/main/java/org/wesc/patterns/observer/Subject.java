package org.wesc.patterns.observer;

/**
 * 具体主题
 */
public class Subject extends AbstractSubject {

    @Override
    public void notifyAllObservers(String message) {
        System.out.println("订阅主题变更消息：" + message);
        for(int i = 0; i < observers.size(); i++) {
            AbstractObserver abstractObserver = observers.get(i);
            abstractObserver.update(message);
        }
        System.out.println("=============消息发送完毕=============\n");
    }
}
