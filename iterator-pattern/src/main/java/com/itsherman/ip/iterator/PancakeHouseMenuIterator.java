package com.itsherman.ip.iterator;

import com.itsherman.ip.origion.MenuItem;

import java.util.ArrayList;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class PancakeHouseMenuIterator implements Iterator{

    ArrayList<MenuItem> memuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> memuItems) {
        this.memuItems = memuItems;
    }

    @Override
    public boolean hasNext() {
       return position < memuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = memuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
