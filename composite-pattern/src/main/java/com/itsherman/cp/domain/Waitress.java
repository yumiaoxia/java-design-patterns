package com.itsherman.cp.domain;

import com.itsherman.cp.domain.MenuComponent;

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
}
