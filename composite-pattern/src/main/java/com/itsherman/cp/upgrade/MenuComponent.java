package com.itsherman.cp.upgrade;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
    public abstract Iterator<MenuComponent> createIterator();
}
