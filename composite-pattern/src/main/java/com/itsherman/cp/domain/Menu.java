package com.itsherman.cp.domain;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }


    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.print(","+getDescription());
        System.out.print("------------------");
        Iterator<MenuComponent> it = menuComponents.iterator();
        while (it.hasNext()){
            MenuComponent menuComponent = it.next();
            menuComponent.print();
        }
    }
}
