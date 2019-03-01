package com.btm.zuul.filter;

import com.btm.zuul.enum_type.FilterType;
import com.btm.zuul.util.ResponseUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wenzhenyu
 * @description 进入过滤器
 * @date 2018/11/28
 */

public class PreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterType.FILTER_TYPE_PRE.getValue();
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            HttpServletRequest request = ctx.getRequest();


            System.out.println("查看具体的结果");

            interfaceCheck(ctx, request);
        } catch (Exception e) {
            responseOutput(ctx, 404, "not found!");
            e.printStackTrace();
        }
        return null;
    }

    private void interfaceCheck(RequestContext ctx, HttpServletRequest request) {


    }

    private void responseOutput(RequestContext ctx, int code, String msg) {
        ctx.setSendZuulResponse(false); //不进行路由
        ResponseUtil.responseOutput(ctx.getResponse(), code, msg);
    }

}
