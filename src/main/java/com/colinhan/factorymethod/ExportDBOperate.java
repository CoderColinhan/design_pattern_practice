package com.colinhan.factorymethod;

public class ExportDBOperate extends ExportOperate {
    @Override
    public ExportFileApi factorymethod() {
        return new ExportDB();
    }
}
