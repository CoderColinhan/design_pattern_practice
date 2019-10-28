package com.colinhan.factorymethod;

public abstract class ExportOperate {

    public abstract ExportFileApi factorymethod();

    public boolean export(String data) {
        ExportFileApi api = factorymethod();
        return api.export(data);
    }
}
