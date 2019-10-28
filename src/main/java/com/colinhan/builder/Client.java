package com.colinhan.builder;

import com.colinhan.builder.data.ExportBodyModel;
import com.colinhan.builder.data.ExportFooterModel;
import com.colinhan.builder.data.ExportHeaderModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 生成器模式
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以构建不同的表示
 */
public class Client {

    public static void main(String[] args) {
        ExportHeaderModel headerModel = new ExportHeaderModel();
        headerModel.setName("nice to meet you");

        Map<String, Collection<ExportBodyModel>> bodydata = new HashMap<String, Collection<ExportBodyModel>>();
        ExportBodyModel bodyModel = new ExportBodyModel();
        bodyModel.setBodyInfo("body body");
        Collection<ExportBodyModel> array = new ArrayList<ExportBodyModel>();
        array.add(bodyModel);
        bodydata.put("no1", array);

        ExportFooterModel footerModel = new ExportFooterModel();
        footerModel.setFooterName("HongKong foot");

        TextBuilder builder = new TextBuilder();

        Director director = new Director(builder);
        director.constructResult(headerModel, bodydata, footerModel);
        System.out.println(builder.getResult());
    }
}
