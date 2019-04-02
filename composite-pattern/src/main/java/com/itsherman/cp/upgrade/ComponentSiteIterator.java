package com.itsherman.cp.upgrade;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class ComponentSiteIterator implements Iterator<MenuComponent> {

    Stack stack = new Stack<>();

    public ComponentSiteIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = (Iterator)stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
           Iterator iterator = (Iterator)stack.peek();
           MenuComponent component = (MenuComponent)iterator.next();
           if(component instanceof Menu){
               stack.push(component.createIterator());
           }
           return component;
        }else{
            return null;
        }
    }

    @Override
    public void remove() {
throw new UnsupportedOperationException();
    }
}
