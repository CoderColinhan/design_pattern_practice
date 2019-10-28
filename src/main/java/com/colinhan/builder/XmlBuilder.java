package com.colinhan.builder;

import com.colinhan.builder.data.ExportBodyModel;
import com.colinhan.builder.data.ExportFooterModel;
import com.colinhan.builder.data.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel headerModel) {
        buffer.append("XmlBuilder " + headerModel.getName());
    }

    public void buildBody(Map<String, Collection<ExportBodyModel>> bodydata) {
        for (String keyName : bodydata.keySet()) {
            buffer.append("XmlBuilder " + keyName);
            for (ExportBodyModel model : bodydata.get(keyName)) {
                buffer.append("XmlBuilder " + model.getBodyInfo());
            }
        }
    }

    public void buildFooter(ExportFooterModel footerModel) {
        buffer.append("XmlBuilder " + footerModel.getFooterName());
    }

    public StringBuffer getResult() {
        return this.buffer;
    }
}
