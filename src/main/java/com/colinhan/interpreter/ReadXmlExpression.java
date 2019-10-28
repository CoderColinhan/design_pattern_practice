package com.colinhan.interpreter;

public abstract class ReadXmlExpression {
    /**
     * 解释表达式
     *
     * @param c
     * @return 解析后的值
     */
    public abstract String[] interpret(Context c);
}
