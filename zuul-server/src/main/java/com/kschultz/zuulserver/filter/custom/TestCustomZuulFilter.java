package com.kschultz.zuulserver.filter.custom;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class TestCustomZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "custom";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override   
    public Object run() {
        log.info("TestCustomZuulFilter.run()");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(request.getRequestURI());

        return null;
    }
}
