package handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object userName = request.getSession().getAttribute("userName");
        if (userName != null) {
            if(!"admin".equals(userName.toString())){
                request.getRequestDispatcher("/manager/login.jsp").forward(request,response);
                return false;
            }
        }
        return true;
    }
}
