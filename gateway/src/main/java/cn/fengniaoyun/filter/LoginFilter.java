package cn.fengniaoyun.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: LiangZF
 * @Description: 自定义过滤器
 * @Date: Created in 9:19 2019/6/12
 * @Modified By: LiangZF
 */
@Component
public class LoginFilter extends ZuulFilter {
    // 类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    // 顺序
    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1 ;
    }

    // 是否拦截
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        // 获取request
        HttpServletRequest request = ctx.getRequest();
        // 获取请求参数token
        String token = request.getParameter("access-token");

        if(StringUtils.isBlank(token)){
            // 未登录，拦截
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.SC_FORBIDDEN);
        }
        return null;
    }
}
