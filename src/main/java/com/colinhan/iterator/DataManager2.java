package com.colinhan.iterator;

import com.colinhan.iterator.data.DataModel;

public class DataManager2 extends Aggregate {
    private DataModel[] array;

    public void calculateData() {
        DataModel data1 = new DataModel();
        data1.setUserName("Colinhan");
        data1.setSalary(300);
        DataModel data2 = new DataModel();
        data2.setUserName("xiaoming");
        data2.setSalary(400);

        array = new DataModel[2];
        array[0] = data1;
        array[1] = data2;
    }

    public DataModel[] getArray() {
        return array;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }
}
