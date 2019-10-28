package com.colinhan.builder;

import com.colinhan.builder.data.ExportBodyModel;
import com.colinhan.builder.data.ExportFooterModel;
import com.colinhan.builder.data.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel headerModel) {
        buffer.append("TextBuilder " + headerModel.getName());
    }

    public void buildBody(Map<String, Collection<ExportBodyModel>> bodydata) {
        for (String keyName : bodydata.keySet()) {
            buffer.append("TextBuilder " + keyName);
            for (ExportBodyModel model : bodydata.get(keyName)) {
                buffer.append("TextBuilder " + model.getBodyInfo());
            }
        }
    }

    public void buildFooter(ExportFooterModel footerModel) {
        buffer.append("TextBuilder " + footerModel.getFooterName());
    }

    public StringBuffer getResult() {
        return this.buffer;
    }
}
