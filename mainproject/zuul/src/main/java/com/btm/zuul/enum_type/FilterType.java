package com.btm.zuul.enum_type;

public enum FilterType {

    FILTER_TYPE_PRE("pre"), FILTER_TYPE_POST("post"), FILTER_TYPE_ERROR("error"), FILTER_TYPE_ROUTE("route");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private FilterType(String value) {
        this.value = value;
    }


}
