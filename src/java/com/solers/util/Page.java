package com.solers.util;

import java.util.Iterator;
import java.util.List;

/**
 * @param <T>
 */
public class Page<T> implements Iterable<T> {
    
    private int count;
    private List<T> page;
    
    public Page(int count, List<T> page) {
        this.count = count;
        this.page = page;
    }
    
    public Page() {
        
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getPage() {
        return page;
    }

    public void setPage(List<T> page) {
        this.page = page;
    }

    @Override
    public Iterator<T> iterator() {
        return page.iterator();
    }
    
}
