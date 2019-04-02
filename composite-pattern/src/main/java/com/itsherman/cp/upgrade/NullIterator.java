package com.itsherman.cp.upgrade;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
throw new UnsupportedOperationException();
    }
}
