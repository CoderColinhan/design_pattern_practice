package com.colinhan.builder;

import com.colinhan.builder.data.ExportBodyModel;
import com.colinhan.builder.data.ExportFooterModel;
import com.colinhan.builder.data.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public interface Builder {
    void buildHeader(ExportHeaderModel headerModel);

    void buildBody(Map<String, Collection<ExportBodyModel>> bodydata);

    void buildFooter(ExportFooterModel footerModel);
}
