package com.itsherman.ip.javaiterator;

import com.itsherman.ip.origion.MenuItem;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public interface Menu {
    public String getName();
    public Iterator<MenuItem> createIterator();
}
