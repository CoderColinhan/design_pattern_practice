package com.colinhan.factorymethod;

public class ExportTextFileOperate extends ExportOperate {
    @Override
    public ExportFileApi factorymethod() {
        return new ExportTextFile();
    }
}
