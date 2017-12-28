package com.pattern.iterator;

/**
 * @author pc
 * @since 2017/12/28.
 */
public class DinerMenu {
    static final int MAX_ITEM = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
