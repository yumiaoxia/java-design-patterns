package com.itsherman.ip.javaiterator;

import com.itsherman.ip.origion.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMemu(){
        Iterator iterator = menus.iterator();
        System.out.println("MENU\n-----\n");
        while (iterator.hasNext()){
            Menu menu = (Menu) iterator.next();
            printMenu(menu);
        }
    }

    private void printMenu(Menu menu){
        Iterator<MenuItem> iterator = menu.createIterator();
        System.out.println(menu.getName());
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName()+",");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println();
    }
}
