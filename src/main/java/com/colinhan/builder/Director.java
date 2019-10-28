package com.colinhan.builder;

import com.colinhan.builder.data.ExportBodyModel;
import com.colinhan.builder.data.ExportFooterModel;
import com.colinhan.builder.data.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class Director {
    /**
     * 持有当前生成器对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructResult(ExportHeaderModel headerModel, Map<String, Collection<ExportBodyModel>> bodydata, ExportFooterModel footerModel) {
        builder.buildHeader(headerModel);
        builder.buildBody(bodydata);
        builder.buildFooter(footerModel);
    }
}
