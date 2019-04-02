package com.itsherman.cp.upgrade;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printWegetatianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){
                e.printStackTrace();
            }
        }
    }
}
