package cn.zealot.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * All right Reserved, Designed By ZHANGSEN
 *
 * @author : zhangsen
 * @date : 2020/5/6 15:29
 */
@Slf4j
public class OpenidFilter extends ZuulFilter {
    @Override
    public String filterType() {
        /*pre - 前置过滤器，在请求被路由前执行，通常用于处理身份认证，日志记录等；

        route - 在路由执行后，服务调用前被调用；

        error - 任意一个filter发生异常的时候执行或远程服务调用没有反馈的时候执行（超时），通常用于处理异常；

        post - 在route或error执行后被调用，一般用于收集服务信息，统计服务性能指标等，也可以对response结果做特殊处理。

         */
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        /*1  按照filterType决定顺序

        Pre 优先 Post执行，此时filterOrder没有作用。

        2 filterType相同

        filterOrder有作用，数字越小，越先执行。（负数也是这个规则，0和-1的话，-1先执行）

        3 相同filterType,相同filterOrder，都执行，执行顺序不清楚。

        prefilter先执行了，post后执行了。
         */
        return -2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();

        log.info("method={}, url={}", request.getMethod(), request.getRequestURL().toString());

//        RequestContext context = RequestContext.getCurrentContext();
//        String token = request.getParameter("openid");
//        if (StringUtils.isEmpty(token)) {
//            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
////            context.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
//            context.setResponseBody("openid required");
//            context.setSendZuulResponse(false);
//            return null;
//        }
        return null;
    }
}
