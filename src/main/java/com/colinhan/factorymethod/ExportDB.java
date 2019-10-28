package com.colinhan.factorymethod;

public class ExportDB implements ExportFileApi {
    public boolean export(String data) {
        System.out.println("导出数据 " + data + " 数据文件");
        return true;
    }
}
