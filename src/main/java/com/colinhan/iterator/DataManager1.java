package com.colinhan.iterator;

import com.colinhan.iterator.data.DataModel;

import java.util.ArrayList;
import java.util.List;

public class DataManager1 extends Aggregate {
    private List list = new ArrayList();

    public void calculateData() {
        DataModel data1 = new DataModel();
        data1.setUserName("Colinhan");
        data1.setSalary(100);
        DataModel data2 = new DataModel();
        data2.setUserName("xiaoming");
        data2.setSalary(200);
        list.add(data1);
        list.add(data2);
    }

    public List getList() {
        return list;
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }
}
