package com.colinhan.factorymethod;

public class ExportTextFile implements ExportFileApi {
    public boolean export(String data) {
        System.out.println("导出数据 " + data + " 到文本文件");
        return true;
    }
}
