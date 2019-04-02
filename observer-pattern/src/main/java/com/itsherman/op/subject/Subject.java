package com.itsherman.op.subject;

import com.itsherman.op.observer.Observer;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
