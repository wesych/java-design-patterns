package org.wesc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class AbstractSubject {

    // 维护一个观察者列表
    protected List<AbstractObserver> observers = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(AbstractObserver observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    public abstract void notifyAllObservers(String message);

}
