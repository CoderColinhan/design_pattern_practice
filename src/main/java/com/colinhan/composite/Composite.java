package com.colinhan.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private String name = "";

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        children.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (children.size() > 0) {
            children.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        return children.get(index);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + " " + name);
        if (children.size() > 0) {
            for (Component item : children) {
                item.printStruct(preStr);
            }
        }
    }
}
