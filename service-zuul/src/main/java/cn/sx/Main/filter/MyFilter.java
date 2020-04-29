//package cn.sx.Main.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
//@Component
//public class MyFilter extends ZuulFilter {
//
//
//    /**
//    filterType:返回字符串,代表过滤器的类型。包含以下4种：
//     * --pre：请求在被路由之前执行
//     * --route：在路由请求时调用
//     * --post ：在route和error过滤器之后调用
//     * --error：处理请求时发生错误调用
//     * @return 返回以上4个类型的名称
//
//    */
//    /**
//     * 过滤器类型，前置过滤器
//     * @return
//     */
//    @Override
//    public String filterType() {
//        return PRE_TYPE;
//    }
//
//    /**
//     * 过滤器顺序，越小越先执行
//     * @return
//     */
//    @Override
//    public int filterOrder() {
//        return 4;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//        System.out.println(request.getRequestURI());
//        System.out.println(request.getRequestURL());
//        //忽略大小写，返回true则拦截，进入run方法
//        //apiResponseParam/
//        //apiService
//        //apiRequestParam
//        //apiTableInfo
//        //apiServiceInfo
//        //InsertOne UpdateOne DeleteOne SelectOne
//        if ("/producer/apiService/InsertOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiService/UpdateOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiService/SelectOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiService/DeleteOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiServiceInfo/InsertOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiServiceInfo/UpdateOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiServiceInfo/SelectOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiServiceInfo/DeleteOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiResponseParam/InsertOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiResponseParam/UpdateOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiResponseParam/SelectOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiResponseParam/DeleteOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiRequestParam/InsertOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiRequestParam/UpdateOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiRequestParam/SelectOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiRequestParam/DeleteOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiTableInfo/InsertOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiTableInfo/UpdateOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiTableInfo/SelectOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        else if("/producer/apiTableInfo/DeleteOne".equalsIgnoreCase(request.getRequestURI())){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        //JWT
//        RequestContext requestContext =  RequestContext.getCurrentContext();
//        HttpServletRequest  request = requestContext.getRequest();
//
//        //token对象
//        String token = request.getHeader("token");
//
//        //如果token字符串为空
//        if(StringUtils.isBlank((token))){
//            token  = request.getParameter("token");
//        }
//
//
//        //登录校验逻辑  根据公司情况自定义 JWT
//        if (StringUtils.isBlank(token)) {
//            //设置为false则不往下走(不调用api接口)
//            requestContext.setSendZuulResponse(false);
//            //响应一个状态码：401
//            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//        }
//
//        return null;
//    }
//}
