package com.colinhan.interpreter;

import com.colinhan.interpreter.util.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 上下文，用来包含解释器需要的一些全局信息
 */
public class Context {
    private Element preEle;
    private Document document;

    public Context(String fileName) throws Exception {
        this.document = XmlUtil.getRoot(fileName);
    }

    /**
     * 重新初始化上下文
     */
    public void reInit() {
        preEle = null;
    }

    /**
     * 各个Expression 公共使用的方法
     * 根据父元素和当前元素的名称来获取当前的元素
     *
     * @param pEle    父元素
     * @param eleName 当前元素的名称
     * @return 当前元素
     */
    public Element getNowEle(Element pEle, String eleName) {
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    return nowEle;
                }
            }
        }
        return null;
    }

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
