package com.colinhan.interpreter;

import org.w3c.dom.Element;

/**
 * 元素作为终结符对应的解释器
 */
public class ElementTerminalExpression extends ReadXmlExpression {

    private String eleName = null;

    public ElementTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文中的元素作为父级元素
        Element pEle = c.getPreEle();
        //查找到当前元素名称所对应的xml元素
        Element ele = null;
        if (pEle == null) {
            ele = c.getDocument().getDocumentElement();
            c.setPreEle(ele);
        } else {
            //根据父级元素和要查找的元素名称来获取当前的元素
            ele = c.getNowEle(pEle, eleName);
            c.setPreEle(ele);
        }

        //然后需要去获取这个元素的值
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;

    }
}
