package com.itsherman.ip.javaiterator;

import com.itsherman.ip.origion.MenuItem;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/28
 */

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove(){
        if(position<=0){
            throw new IllegalStateException("You can't remove an item until you've done at least next()");
        }
        if(items[position-1] != null){
            for (int i = position-1; i < items.length-1; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
